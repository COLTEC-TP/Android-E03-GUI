package br.ufmg.coltec.tp.e03_layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);
        ObjectAnimator animation = ObjectAnimator.ofFloat(logo, "translationY", 1400f);
        ObjectAnimator animation2 = ObjectAnimator.ofFloat(logo, "rotationX", 1080f);
        animation.setDuration(2000);
        animation2.setDuration(2000);
        animation2.setRepeatCount(2);
        animation2.setStartDelay(300);
        AnimatorSet roll = new AnimatorSet();
        roll.play(animation).with(animation2);
        roll.start();
        roll.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                finish();
            }
        });
    }
}
