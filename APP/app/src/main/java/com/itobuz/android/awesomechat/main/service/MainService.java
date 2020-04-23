package com.itobuz.android.awesomechat.main.service;

import com.itobuz.android.awesomechat.user.data_model.User;

/**
 * Created by Debasis on 16/12/16.
 */

public interface MainService {

    String getLoginProvider() throws Exception;

    void initLastSeen(User user);

    void logout();

}
