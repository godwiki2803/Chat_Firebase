package com.itobuz.android.awesomechat.login.database;

import com.itobuz.android.awesomechat.login.data_model.Authentication;

import rx.Observable;

/**
 * Created by Debasis on 27/01/17.
 */

public interface AuthDatabase {

    Observable<Authentication> readAuthentication();

    Observable<Authentication> loginWithGoogle(String idToken);

    Observable<Authentication> loginWithEmailAndPass(String email, String password);

    Observable<Authentication> loginWithFacebook(String idToken);

    void sendPasswordResetEmail(String email);

}
