// Generated code from Butter Knife. Do not modify!
package com.kaaddevelopers.myprescriptor.auth.signup.view;

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

public class SignupActivity_ViewBinding implements Unbinder {
  private SignupActivity target;

  private View view2131362083;

  private View view2131361926;

  @UiThread
  public SignupActivity_ViewBinding(SignupActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignupActivity_ViewBinding(final SignupActivity target, View source) {
    this.target = target;

    View view;
    target.emailEditText = Utils.findRequiredViewAsType(source, R.id.signupActivityEmailEditText, "field 'emailEditText'", EditText.class);
    target.passwordEditText = Utils.findRequiredViewAsType(source, R.id.signupActivityPasswordEditText, "field 'passwordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.signupActivitySignupButton, "field 'signupButton' and method 'signupButtonClicked'");
    target.signupButton = Utils.castView(view, R.id.signupActivitySignupButton, "field 'signupButton'", Button.class);
    view2131362083 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.signupButtonClicked();
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
    SignupActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emailEditText = null;
    target.passwordEditText = null;
    target.signupButton = null;
    target.googleLoginButton = null;

    view2131362083.setOnClickListener(null);
    view2131362083 = null;
    view2131361926.setOnClickListener(null);
    view2131361926 = null;
  }
}
