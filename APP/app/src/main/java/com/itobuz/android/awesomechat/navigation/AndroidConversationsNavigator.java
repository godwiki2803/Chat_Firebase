package com.itobuz.android.awesomechat.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itobuz.android.awesomechat.conversation.ConversationActivity;


/**
 * Created by Debasis on 31/12/16.
 */

public class AndroidConversationsNavigator implements Navigator {

    private final AppCompatActivity activity;
    private final Navigator navigator;

    public AndroidConversationsNavigator(AppCompatActivity activity, Navigator navigator) {
        this.activity = activity;
        this.navigator = navigator;
    }


    @Override
    public void toLogin() {
        activity.onBackPressed();
    }

    @Override
    public void toMainActivity() {

    }

    @Override
    public void toParent() {

    }

    public void toSelectedConversation(Bundle bundle) {
        Intent intent = new Intent(activity, ConversationActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }
}
