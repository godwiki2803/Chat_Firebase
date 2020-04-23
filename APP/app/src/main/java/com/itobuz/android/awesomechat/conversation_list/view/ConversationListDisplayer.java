package com.itobuz.android.awesomechat.conversation_list.view;

import com.itobuz.android.awesomechat.conversation_list.data_model.Conversation;
import com.itobuz.android.awesomechat.conversation_list.data_model.Conversations;

/**
 * Created by Debasis on 29/12/16.
 */

public interface ConversationListDisplayer {

    void display(Conversations conversations);

    void addToDisplay(Conversation conversation);

    void attach(ConversationInteractionListener conversationInteractionListener);

    void detach(ConversationInteractionListener conversationInteractionListener);

    interface ConversationInteractionListener {

        void onConversationSelected(Conversation conversation);

    }

}
