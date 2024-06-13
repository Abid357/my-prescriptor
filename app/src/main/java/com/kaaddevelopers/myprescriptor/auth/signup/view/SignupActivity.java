package com.kaaddevelopers.myprescriptor.auth.signup.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.kaaddevelopers.myprescriptor.R;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Observable;

public class SignupActivity extends DaggerAppCompatActivity implements SignupView{

    @Inject
    SignupPresenter presenter;

    @Inject
    Context context;

    @BindView(R.id.signupActivityEmailEditText)
    EditText emailEditText;

    @BindView(R.id.signupActivityPasswordEditText)
    EditText passwordEditText;

    @BindView(R.id.signupActivitySignupButton)
    Button signupButton;

    @BindView(R.id.googleLoginActivityLogin)
    Button googleLoginButton;

    private MaterialDialog progressDialog;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_2);
        unbinder = ButterKnife.bind(this);
        presenter.checkEmailAndPassword();
        signupButton.setEnabled(false);
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @OnClick(R.id.signupActivitySignupButton)
    public void signupButtonClicked(){
        presenter.signupButtonClicked();
    }

    @Override
    public String getEmail() {
        return emailEditText.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordEditText.getText().toString();
    }

    @Override
    public Observable<CharSequence> attachEmailListener() {
        return RxTextView.textChanges(emailEditText);
    }

    @Override
    public Observable<CharSequence> attachPasswordListener() {
        return RxTextView.textChanges(passwordEditText);
    }

    @Override
    public void showInvalidEmailMessage(String errorMessage) {
        emailEditText.setError(errorMessage);
    }

    @Override
    public void showInvalidPasswordMessage(String errorMessage) {
        passwordEditText.setError(errorMessage);
    }

    @Override
    public void setSignupButtonEnabled(boolean isEnabled) {
        signupButton.setEnabled(isEnabled);
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
    public void goToAlmostThereActivity() {
        Intent intent = new Intent(this, AlmostThereActivity.class);
        SharedPreferences pref = this.getSharedPreferences("UserDetails", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("email", emailEditText.getText().toString());
        editor.putString("password", passwordEditText.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.googleLoginActivityLogin)
    public void goToGoogleLoginActivity(){
        Intent intent = new Intent(this, GoogleLoginActivity.class);
        startActivity(intent);
    }

}
