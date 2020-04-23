package com.itobuz.android.awesomechat.conversation.view;

import android.support.v7.widget.RecyclerView;

import com.itobuz.android.awesomechat.conversation.data_model.Message;

/**
 * Created by Debasis on 29/12/16.
 */

class ConversationMessageViewHolder extends RecyclerView.ViewHolder {

    private final ConversationMessageView conversationMessageView;

    public ConversationMessageViewHolder(ConversationMessageView messageView) {
        super(messageView);
        this.conversationMessageView = messageView;
    }

    public void bind(Message message) {
        conversationMessageView.display(message);
    }
}
