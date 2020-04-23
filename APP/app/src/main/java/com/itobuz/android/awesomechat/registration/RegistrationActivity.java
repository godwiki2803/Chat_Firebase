package com.itobuz.android.awesomechat.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.itobuz.android.awesomechat.BaseActivity;
import com.itobuz.android.awesomechat.Dependencies;
import com.itobuz.android.awesomechat.R;
import com.itobuz.android.awesomechat.navigation.AndroidRegistrationNavigator;
import com.itobuz.android.awesomechat.registration.presenter.RegistrationPresenter;
import com.itobuz.android.awesomechat.registration.view.RegistrationDisplayer;

/**
 * Created by Debasis on 28/12/16.
 */

public class RegistrationActivity extends BaseActivity {

    private RegistrationPresenter presenter;
    private AndroidRegistrationNavigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        RegistrationDisplayer registrationDisplayer = (RegistrationDisplayer) findViewById(R.id.registrationView);
        navigator = new AndroidRegistrationNavigator(this);
        presenter = new RegistrationPresenter(
                Dependencies.INSTANCE.getRegistrationService(),
                registrationDisplayer,
                navigator);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

            super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.startPresenting();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.stopPresenting();
    }


}
