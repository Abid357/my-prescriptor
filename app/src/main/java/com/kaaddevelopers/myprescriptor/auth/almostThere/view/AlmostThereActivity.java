package com.kaaddevelopers.myprescriptor.auth.almostThere.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.kaaddevelopers.myprescriptor.R;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenter;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;
import com.mukesh.countrypicker.Country;
import com.mukesh.countrypicker.CountryPicker;
import com.mukesh.countrypicker.CountryPickerListener;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Observable;

public class AlmostThereActivity extends DaggerAppCompatActivity implements AlmostThereView {

    @Inject
    AlmostTherePresenter presenter;

    @Inject
    Context context;

    @BindView(R.id.almostThereUsername)
    EditText usernameEditText;

    @BindView(R.id.almostThereFirstName)
    EditText firstNameEditText;

    @BindView(R.id.almostThereLastName)
    EditText lastNameEditText;

    @BindView(R.id.almostThereAge)
    EditText ageEditText;

    @BindView(R.id.almostThereNationality)
    TextView nationalityTextView;

    @BindView(R.id.almostTherePhone)
    EditText phoneEditText;

    @BindView(R.id.almostThereISOCode)
    TextView isoCodeTextView;

    @BindView(R.id.almostThereDialCode)
    TextView dialCodeTextView;

    @BindView(R.id.almostThereNationalityFlag)
    ImageView nationalityFlagImageView;

    @BindView(R.id.almostTherePhoneFlag)
    ImageView phoneFlagImageView;

    @BindView(R.id.almostThereDoneButton)
    Button doneButton;

    private MaterialDialog progressDialog;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        unbinder = ButterKnife.bind(this);
        presenter.attachListeners();
        doneButton.setEnabled(false);

        //set nationality and phone number details based on SIM
        Country country = Country.getCountryFromSIM(this);
        nationalityFlagImageView.setImageResource(country.getFlag());
        isoCodeTextView.setText(country.getCode());
        dialCodeTextView.setText(country.getDialCode());
        phoneFlagImageView.setImageResource(country.getFlag());

        nationalityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryPicker picker = CountryPicker.newInstance("Select Country");  // dialog title
                picker.setListener(new CountryPickerListener() {
                    @Override
                    public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
                        nationalityFlagImageView.setImageResource(flagDrawableResID);
                        picker.dismiss();
                    }
                });
                picker.show(getSupportFragmentManager(), "COUNTRY_PICKER");
            }
        });
        phoneFlagImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryPicker picker = CountryPicker.newInstance("Select Country");  // dialog title
                picker.setListener(new CountryPickerListener() {
                    @Override
                    public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
                        isoCodeTextView.setText(code);
                        dialCodeTextView.setText(dialCode);
                        phoneFlagImageView.setImageResource(flagDrawableResID);
                        picker.dismiss();
                    }
                });
                picker.show(getSupportFragmentManager(), "COUNTRY_PICKER");
            }
        });
    }

    @OnClick(R.id.almostThereDoneButton)
    public void doneButtonClicked() {
        presenter.doneButtonClicked();
    }

    @Override
    public String getUsername() {
        return usernameEditText.getText().toString();
    }

    @Override
    public String getFirstName() {
        return firstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastNameEditText.getText().toString();
    }

    @Override
    public String getEmail() {
        SharedPreferences pref = this.getSharedPreferences("UserDetails", MODE_PRIVATE);
        return pref.getString("email", null);
    }

    @Override
    public String getNationality() {
        return nationalityTextView.getText().toString();
    }

    @Override
    public String getPhone() {
        return phoneEditText.getText().toString();
    }

    @Override
    public int getAge() {
        return Integer.parseInt(ageEditText.getText().toString());
    }

    @Override
    public Observable<CharSequence> attachUsernameListener() {
        return RxTextView.textChanges(usernameEditText).skip(1).debounce(400, TimeUnit.MILLISECONDS);
    }

    @Override
    public Observable<CharSequence> attachFirstNameListener() {
        return RxTextView.textChanges(firstNameEditText);
    }

    @Override
    public Observable<CharSequence> attachLastNameListener() {
        return RxTextView.textChanges(lastNameEditText);
    }

    @Override
    public Observable<CharSequence> attachAgeListener() {
        return RxTextView.textChanges(ageEditText);
    }

    @Override
    public Observable<CharSequence> attachPhoneListener() {
        return RxTextView.textChanges(phoneEditText);
    }

    @Override
    public void showInvalidUsernameMessage(String errorMessage) {
        usernameEditText.setError(errorMessage);
    }

    @Override
    public void showInvalidFirstNameMessage(String errorMessage) {
        firstNameEditText.setError(errorMessage);
    }

    @Override
    public void showInvalidLastNameMessage(String errorMessage) {
        lastNameEditText.setError(errorMessage);
    }

    @Override
    public void showInvalidPhoneMessage(String errorMessage) {
        phoneEditText.setError(errorMessage);
    }

    @Override
    public void showInvalidAgeMessage(String errorMessage) {
        ageEditText.setError(errorMessage);
    }

    @Override
    public void setDoneButtonEnabled(boolean isEnabled) {
        doneButton.setEnabled(isEnabled);
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
    public void goToHomepage() {
        Intent intent = new Intent(this, HomepageActivity.class);
        SharedPreferences pref = this.getSharedPreferences("UserDetails", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("username", usernameEditText.getText().toString());
        editor.putString("firstName", firstNameEditText.getText().toString());
        editor.putString("lastName", lastNameEditText.getText().toString());
        editor.putString("nationality", nationalityTextView.getText().toString());
        editor.putString("phone", phoneEditText.getText().toString());
        editor.putString("age", ageEditText.getText().toString());
        startActivity(intent);
    }
}
