package com.itobuz.android.awesomechat.navigation;

/**
 * Created by Debasis on 28/12/16.
 */

public interface RegistrationNavigator extends Navigator {

    void toLogin();

    void attach(RegistrationResultListener registrationResultListener);

    void detach(RegistrationResultListener registrationResultListener);

    interface RegistrationResultListener {

        void onRegistrationSuccess(String statusMessage);

        void onRegistrationFailed(String statusMessage);

    }
}
