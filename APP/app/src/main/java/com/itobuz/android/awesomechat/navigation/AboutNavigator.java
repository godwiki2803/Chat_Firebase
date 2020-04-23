package com.itobuz.android.awesomechat.navigation;

import android.graphics.Bitmap;
import android.widget.TextView;

import com.itobuz.android.awesomechat.user.data_model.User;

/**
 * Created by Debasis on 24/02/17.
 */

public interface AboutNavigator extends Navigator {


    void showOkDialog();

    void attach(AboutDialogListener dialogListener);

    void detach(AboutDialogListener dialogListener);

    interface AboutDialogListener {

        void onOkSelected();
    }

}
