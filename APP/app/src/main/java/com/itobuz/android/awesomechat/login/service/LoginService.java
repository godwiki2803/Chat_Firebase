package com.itobuz.android.awesomechat.login.service;


import com.itobuz.android.awesomechat.login.data_model.Authentication;

import rx.Observable;

/**
 * Created by Debasis on 27/01/17.
 */

public interface LoginService {

    Observable<Authentication> getAuthentication();

    void loginWithGoogle(String idToken);

    void loginWithFacebook(String idToken);

    void loginWithEmailAndPass(String email, String password);

    void sendPasswordResetEmail(String email);

}
