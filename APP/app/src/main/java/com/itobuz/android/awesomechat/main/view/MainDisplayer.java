package com.itobuz.android.awesomechat.main.view;

import android.support.design.widget.TabLayout;
import android.view.MenuItem;

import com.itobuz.android.awesomechat.user.data_model.User;

/**
 * Created by Debasis on 16/12/16.
 */

public interface MainDisplayer {

    void attach(DrawerActionListener drawerActionListener, NavigationActionListener navigationActionListener, SearchActionListener searchActionListener, TabActionListener tabActionListener);

    void detach(DrawerActionListener drawerActionListener, NavigationActionListener navigationActionListener, SearchActionListener searchActionListener, TabActionListener tabActionListener);

    void setTitle(String title);

    void setUser(User user);

    void inflateMenu();

    void clearMenu();

    void setConversationTabSelect();

    void setUsersTabSelect();

    boolean onBackPressed();

    void openDrawer();

    void closeDrawer();

    interface DrawerActionListener {

        void onHeaderSelected();

        void onNavigationItemSelected(MenuItem item);

    }

    interface NavigationActionListener {

        void onHamburgerPressed();

    }

    interface SearchActionListener {

        void showFilteredUsers(String text);

    }

    interface TabActionListener{
        void onTabItemSelected(TabLayout.Tab tab);
    }


    interface ViewActionListener {

        void showFilteredUsers(String text);

    }


}
