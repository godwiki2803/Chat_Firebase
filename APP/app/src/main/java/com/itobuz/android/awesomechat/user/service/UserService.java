package com.itobuz.android.awesomechat.user.service;

import com.itobuz.android.awesomechat.user.data_model.User;
import com.itobuz.android.awesomechat.user.data_model.Users;

import rx.Observable;

/**
 * Created by Debasis on 31/12/16.
 */

public interface UserService {

    Observable<Users> syncUsers();

    Observable<Users> syncOnlineUsers();

    Observable<User> getUser(String userId);

    Observable<Users> getUsers();

    void setName(User user, String name);

    void setStatus(User user, String status);

    void setPlaceName(User user, String placeName);

    void setPlaceLat(User user, String placeLat);

    void setPlaceLong(User user, String placeLong);

    void setProfileImage(User user, String image);

}