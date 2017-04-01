package com.example.venessa.myapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int timeout = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageview;
        imageview = (ImageView)findViewById(R.id.imageView9);
        /*Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        imageview.startAnimation(rotation);*/
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        rotation.setRepeatCount(Animation.INFINITE);
        imageview.startAnimation(rotation);
        /*Animation transln = AnimationUtils.loadAnimation(this,R.anim.translate);
        transln.setRepeatCount(Animation.INFINITE);
        ImageView imageview2;
        imageview2 = (ImageView)findViewById(R.id.imageView2);
        imageview.startAnimation(transln);*/
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Animation rotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                rotation.setRepeatCount(Animation.INFINITE);
                imageview.startAnimation(rotation);

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                finish();
            }
        },timeout);
    }
}
