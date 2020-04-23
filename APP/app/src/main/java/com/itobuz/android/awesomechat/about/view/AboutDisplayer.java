package com.itobuz.android.awesomechat.about.view;

import android.graphics.Bitmap;
import android.widget.TextView;

import com.itobuz.android.awesomechat.user.data_model.User;

/**
 * Created by Debasis on 22/02/17.
 */

public interface AboutDisplayer {

    void aboutUs();

    void attach(AboutActionListener AboutActionListener);

    void detach(AboutActionListener AboutActionListener);

    interface AboutActionListener {

        void onUpPressed();

        void onOkPressed();

    }

}
