package com.itobuz.android.awesomechat.conversation_list.service;

import com.itobuz.android.awesomechat.conversation.data_model.Message;
import com.itobuz.android.awesomechat.user.data_model.User;
import com.itobuz.android.awesomechat.user.data_model.Users;

import java.util.List;

import rx.Observable;

/**
 * Created by Debasis on 29/12/16.
 */

public interface ConversationListService {

    Observable<Message> getLastMessageFor(User self, User destination);

    Observable<List<String>> getConversationsFor(User user);

    Observable<Users> getUsers(List<String> usersId);

    Observable<Integer> getUnreadCount(String self, String destination);

    void setUnreadCount(String self, String destination, int value);

}
