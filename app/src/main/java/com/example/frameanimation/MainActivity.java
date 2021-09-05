package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable batAnumation;
    private ImageView Bat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bat = (ImageView) findViewById(R.id.BatID);
        Bat.setBackgroundResource(R.drawable.bat_anim);
        batAnumation = (AnimationDrawable) Bat.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        batAnumation.start();
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                batAnumation.stop();
            }
        },5000 );
        return super.onTouchEvent(event);
    }
}
