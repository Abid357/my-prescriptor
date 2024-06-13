package com.kaaddevelopers.myprescriptor.auth.googleLogin.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

public class GoogleLoginActivity extends DaggerAppCompatActivity implements GoogleLoginView {

    @Inject
    GoogleLoginPresenter presenter;

    @Inject
    Context context;

    private MaterialDialog progressDialog;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        unbinder = ButterKnife.bind(this);
        showLoadingDialogBox("Contacting Google", "Please wait while we are authenticating your account...");
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken("758334594223-kesnntqnpfglfo5oj3gdt8nmkh4lb56h.apps.googleusercontent.com")
                .requestEmail()
                .build();
        GoogleSignInClient client = GoogleSignIn.getClient(this, gso);
        startActivityForResult(client.getSignInIntent(), 1);
        client.signOut(); // clears Google cache so that Google account selection always pops up upon login
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        try {
            // Google Sign In was successful, authenticate with Firebase
            GoogleSignInAccount account = task.getResult(ApiException.class);
            SharedPreferences pref = this.getSharedPreferences("UserDetails", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("email", account.getEmail());
            presenter.signinUser(account.getIdToken());
        } catch (ApiException e) {
            // Google Sign In failed, update UI appropriately
            showLoadingDialogBoxError("Contacting Google", "Sorry! We could not authenticate your account.");
        }
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
