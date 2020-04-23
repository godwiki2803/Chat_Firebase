package com.itobuz.android.awesomechat.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itobuz.android.awesomechat.Dependencies;
import com.itobuz.android.awesomechat.R;
import com.itobuz.android.awesomechat.navigation.AndroidConversationsNavigator;
import com.itobuz.android.awesomechat.navigation.AndroidNavigator;
import com.itobuz.android.awesomechat.user.presenter.UsersPresenter;
import com.itobuz.android.awesomechat.user.view.UsersDisplayer;

/**
 * Created by Debasis on 19/12/16.
 */

public class UsersFragment extends Fragment {

    private UsersPresenter presenter;
    private AndroidConversationsNavigator navigator;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_users, container, false);
        getActivity().setTitle(R.string.users_toolbar_title);

        navigator = new AndroidConversationsNavigator((AppCompatActivity)getActivity(),new AndroidNavigator(getActivity()));
        presenter = new UsersPresenter(
                (UsersDisplayer) rootView.findViewById(R.id.usersView),
                navigator,
                Dependencies.INSTANCE.getLoginService(),
                Dependencies.INSTANCE.getUserService()
        );

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
    public void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter("SEARCH");
        getActivity().registerReceiver(searchReceiver, filter);
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(searchReceiver);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private final BroadcastReceiver searchReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String text = intent.getStringExtra("search");
            presenter.filterUsers(text);
        }
    };

}
