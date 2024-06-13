// Generated code from Butter Knife. Do not modify!
package com.kaaddevelopers.myprescriptor.auth.login.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.kaaddevelopers.myprescriptor.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131361979;

  private View view2131361926;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.emailEditText = Utils.findRequiredViewAsType(source, R.id.loginActivityEmailEditText, "field 'emailEditText'", EditText.class);
    target.passwordEditText = Utils.findRequiredViewAsType(source, R.id.loginActivityPasswordEditText, "field 'passwordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.loginActivityLoginButton, "field 'loginButton' and method 'loginButtonClicked'");
    target.loginButton = Utils.castView(view, R.id.loginActivityLoginButton, "field 'loginButton'", Button.class);
    view2131361979 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.loginButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.googleLoginActivityLogin, "field 'googleLoginButton' and method 'goToGoogleLoginActivity'");
    target.googleLoginButton = Utils.castView(view, R.id.googleLoginActivityLogin, "field 'googleLoginButton'", Button.class);
    view2131361926 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToGoogleLoginActivity();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emailEditText = null;
    target.passwordEditText = null;
    target.loginButton = null;
    target.googleLoginButton = null;

    view2131361979.setOnClickListener(null);
    view2131361979 = null;
    view2131361926.setOnClickListener(null);
    view2131361926 = null;
  }
}
