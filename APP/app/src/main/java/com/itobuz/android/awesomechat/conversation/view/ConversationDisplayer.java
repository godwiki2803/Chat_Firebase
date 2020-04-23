package com.itobuz.android.awesomechat.conversation.view;

import com.itobuz.android.awesomechat.conversation.data_model.Chat;
import com.itobuz.android.awesomechat.conversation.data_model.Message;

/**
 * Created by Debasis on 29/12/16.
 */

public interface ConversationDisplayer {

    void display(Chat chat, String user);

    void addToDisplay(Message message, String user);

    void setupToolbar(String user, String image, long lastSeen);

    void showTyping();

    void hideTyping();

    void attach(ConversationActionListener conversationInteractionListener);

    void detach(ConversationActionListener conversationInteractionListener);

    void enableInteraction();

    void disableInteraction();

    interface ConversationActionListener {

        void onUpPressed();

        void onMessageLengthChanged(int messageLength);

        void onSubmitMessage(String message);

    }

}
