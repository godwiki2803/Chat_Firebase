package com.itobuz.android.awesomechat.main.service;

import com.itobuz.android.awesomechat.user.data_model.User;

import rx.Observable;

/**
 * Created by Debasis on 17/12/16.
 */

public interface CloudMessagingService {

    Observable<String> readToken(User user);

    void setToken(User user);

}
