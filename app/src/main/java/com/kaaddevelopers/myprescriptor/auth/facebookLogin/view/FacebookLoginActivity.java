package com.kaaddevelopers.myprescriptor.auth.facebookLogin.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Abid-Temp on 04-Jan-18.
 */

public class FacebookLoginActivity extends DaggerAppCompatActivity implements FacebookLoginView {


    @Inject
    FacebookLoginPresenter presenter;

    @Inject
    Context context;

    private MaterialDialog progressDialog;

    private Unbinder unbinder;

    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        unbinder = ButterKnife.bind(this);
        showLoadingDialogBox("Contacting Facebook", "Please wait while we are authenticating your account...");
        callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile, email"));
        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        getUserProfile(loginResult.getAccessToken());
                        presenter.signinUser(loginResult.getAccessToken().getToken());
                    }

                    @Override
                    public void onCancel() {
                        showLoadingDialogBoxError("Contacting Facebook", "Authentication has been canceled.");
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        showLoadingDialogBoxError("Contacting Facebook", "Sorry! We could not authenticate your account.");
                    }
                });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void getUserProfile(AccessToken accessToken) {
        Profile profile = Profile.getCurrentProfile();
        // Facebook Email address
        GraphRequest request = GraphRequest.newMeRequest(
                accessToken,
                new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject json, GraphResponse response) {
                        if (response.getError() == null) {
                            SharedPreferences pref = getSharedPreferences("UserDetails", MODE_PRIVATE);
                            SharedPreferences.Editor editor = pref.edit();
                            editor.putString("email", json.optString("email"));
                            editor.putString("firstName", json.optString("first_name"));
                            editor.putString(("lastName"), json.optString("last_name"));
                        }

                    }
                });
        Bundle parameters = new Bundle();
        parameters.putString("fields", "first_name, last_name, email");
        request.setParameters(parameters);
        request.executeAsync();
    }


    @Override
    public void showLoadingDialogBox(String title, String content) {
        progressDialog = new MaterialDialog.Builder(this)
                .title(title)
                .content(content)
                .progress(true, 0)
                .progressIndeterminateStyle(true)
                .autoDismiss(false)
                .canceledOnTouchOutside(false)
                .show();
    }

    @Override
    public void showLoadingDialogBoxError(String title, String content) {
        progressDialog.setTitle(title);
        progressDialog.setContent(content);
        progressDialog.setCanceledOnTouchOutside(true);
    }

    @Override
    public void goToHomeActivity() {
        Intent intent = new Intent(this, HomepageActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToAlmostThereActivity() {
        Intent intent = new Intent(this, AlmostThereActivity.class);
        startActivity(intent);
    }

    @Override
    public String getEmail() {
        SharedPreferences pref = this.getSharedPreferences("UserDetails", MODE_PRIVATE);
        return pref.getString("email", null);
    }
}
