package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import static android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

public class PrevisaoTempoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previsao_tempo);

        getActionBar().hide();

        View decorView = getWindow().getDecorView();
        int uiOptions = SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}