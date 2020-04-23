package com.itobuz.android.awesomechat.user.view;

import com.itobuz.android.awesomechat.user.data_model.User;
import com.itobuz.android.awesomechat.user.data_model.Users;

/**
 * Created by Debasis on 01/02/17.
 */

public interface UsersDisplayer {

    void display(Users users);

    void attach(UserInteractionListener userInteractionListener);

    void detach(UserInteractionListener userInteractionListener);

    interface UserInteractionListener {

        void onUserSelected(User user);

    }

    void filter(String text);

}
