package com.itobuz.android.awesomechat.main.service;

import com.itobuz.android.awesomechat.main.database.CloudMessagingDatabase;
import com.itobuz.android.awesomechat.user.data_model.User;

import rx.Observable;

/**
 * Created by Debasis on 17/12/16.
 */

public class FirebaseCloudMessagingService implements CloudMessagingService {

    private CloudMessagingDatabase messagingDatabase;

    public FirebaseCloudMessagingService(CloudMessagingDatabase messagingDatabase) {
        this.messagingDatabase = messagingDatabase;
    }

    @Override
    public Observable<String> readToken(User user) {
        return messagingDatabase.readToken(user);
    }

    @Override
    public void setToken(User user) {
        messagingDatabase.setToken(user);
    }
}
