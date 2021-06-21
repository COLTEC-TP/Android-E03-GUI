package br.ufmg.coltec.tp.e03_layout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends DebugActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(Splash.this, MainActivity.class);
            Splash.this.startActivity(mainIntent);
            Splash.this.finish();
        }, 1000);
    }}