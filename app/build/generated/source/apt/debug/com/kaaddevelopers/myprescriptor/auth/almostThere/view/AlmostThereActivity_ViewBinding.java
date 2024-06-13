// Generated code from Butter Knife. Do not modify!
package com.kaaddevelopers.myprescriptor.auth.almostThere.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.kaaddevelopers.myprescriptor.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlmostThereActivity_ViewBinding implements Unbinder {
  private AlmostThereActivity target;

  private View view2131361831;

  @UiThread
  public AlmostThereActivity_ViewBinding(AlmostThereActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlmostThereActivity_ViewBinding(final AlmostThereActivity target, View source) {
    this.target = target;

    View view;
    target.usernameEditText = Utils.findRequiredViewAsType(source, R.id.almostThereUsername, "field 'usernameEditText'", EditText.class);
    target.firstNameEditText = Utils.findRequiredViewAsType(source, R.id.almostThereFirstName, "field 'firstNameEditText'", EditText.class);
    target.lastNameEditText = Utils.findRequiredViewAsType(source, R.id.almostThereLastName, "field 'lastNameEditText'", EditText.class);
    target.ageEditText = Utils.findRequiredViewAsType(source, R.id.almostThereAge, "field 'ageEditText'", EditText.class);
    target.nationalityTextView = Utils.findRequiredViewAsType(source, R.id.almostThereNationality, "field 'nationalityTextView'", TextView.class);
    target.phoneEditText = Utils.findRequiredViewAsType(source, R.id.almostTherePhone, "field 'phoneEditText'", EditText.class);
    target.isoCodeTextView = Utils.findRequiredViewAsType(source, R.id.almostThereISOCode, "field 'isoCodeTextView'", TextView.class);
    target.dialCodeTextView = Utils.findRequiredViewAsType(source, R.id.almostThereDialCode, "field 'dialCodeTextView'", TextView.class);
    target.nationalityFlagImageView = Utils.findRequiredViewAsType(source, R.id.almostThereNationalityFlag, "field 'nationalityFlagImageView'", ImageView.class);
    target.phoneFlagImageView = Utils.findRequiredViewAsType(source, R.id.almostTherePhoneFlag, "field 'phoneFlagImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.almostThereDoneButton, "field 'doneButton' and method 'doneButtonClicked'");
    target.doneButton = Utils.castView(view, R.id.almostThereDoneButton, "field 'doneButton'", Button.class);
    view2131361831 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.doneButtonClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AlmostThereActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.usernameEditText = null;
    target.firstNameEditText = null;
    target.lastNameEditText = null;
    target.ageEditText = null;
    target.nationalityTextView = null;
    target.phoneEditText = null;
    target.isoCodeTextView = null;
    target.dialCodeTextView = null;
    target.nationalityFlagImageView = null;
    target.phoneFlagImageView = null;
    target.doneButton = null;

    view2131361831.setOnClickListener(null);
    view2131361831 = null;
  }
}
