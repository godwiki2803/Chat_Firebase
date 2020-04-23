package com.itobuz.android.awesomechat.app_intro;


import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.itobuz.android.awesomechat.BaseActivity;
import com.itobuz.android.awesomechat.R;
import com.itobuz.android.awesomechat.login.LoginActivity;



public class SplashActivity extends BaseActivity {
    private ImageView splashIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        //splash icon
        splashIcon = (ImageView) findViewById(R.id.splash_icon);
        //animation icon at splash screen
        Animation fadeicon = AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.fade_in);

        splashIcon.setAnimation(fadeicon);

        fadeicon.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //TODO: Auto-generated method stub
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //TODO: Auto-generated method stub
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                //TODO: Auto-generated method stub
            }
        });
    }
}
