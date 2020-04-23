package com.itobuz.android.awesomechat.registration.service;

import rx.Observable;

/**
 * Created by Debasis on 28/12/16.
 */

public interface RegistrationService {

    Observable<Boolean> getRegistration();

    void registerWithEmailAndPass(String email, String password);

}
