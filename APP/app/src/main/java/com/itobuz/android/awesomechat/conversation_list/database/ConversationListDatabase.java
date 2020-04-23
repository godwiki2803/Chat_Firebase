package com.itobuz.android.awesomechat.conversation_list.database;

import com.itobuz.android.awesomechat.user.data_model.User;

import java.util.List;

import rx.Observable;

/**
 * Created by Debasis on 29/12/16.
 */

public interface ConversationListDatabase {

    Observable<List<String>> observeConversationsFor(User user);

    Observable<Integer> observeUnreadCount(String self, String destination);

    void setUnreadCount(String self, String destination, Integer value);

}
