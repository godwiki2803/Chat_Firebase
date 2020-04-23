package com.itobuz.android.awesomechat.conversation_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itobuz.android.awesomechat.Dependencies;
import com.itobuz.android.awesomechat.R;
import com.itobuz.android.awesomechat.conversation_list.presenter.ConversationListPresenter;
import com.itobuz.android.awesomechat.conversation_list.view.ConversationListDisplayer;
import com.itobuz.android.awesomechat.navigation.AndroidConversationsNavigator;
import com.itobuz.android.awesomechat.navigation.AndroidNavigator;

/**
 * Created by Debasis on 29/12/16.
 */

public class ConversationListFragment extends Fragment {

    private ConversationListPresenter presenter;
    private AndroidConversationsNavigator navigator;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_conversations, container, false);
        getActivity().setTitle(R.string.conversations_toolbar_title);

        navigator = new AndroidConversationsNavigator((AppCompatActivity)getActivity(),new AndroidNavigator(getActivity()));
        presenter = new ConversationListPresenter(
                (ConversationListDisplayer) rootView.findViewById(R.id.conversationsView),
                Dependencies.INSTANCE.getConversationListService(),
                navigator,
                Dependencies.INSTANCE.getLoginService(),
                Dependencies.INSTANCE.getUserService());

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.startPresenting();
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.stopPresenting();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
