package br.ufmg.coltec.tp.e03_layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {
    private static final String CLASS_NAME = DebugActivity.class.getSimpleName();

    void createLog(String local, String msg) {
        Log.d(CLASS_NAME, "DebugActivity." + local + "." + getClass().getSimpleName() + ": " + msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(CLASS_NAME, "DebugActivity.onCreate(): " + getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(CLASS_NAME, "DebugActivity.onStart(): " + getClass().getSimpleName());
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(CLASS_NAME, "DebugActivity.onResume(): " + getClass().getSimpleName());
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(CLASS_NAME, "DebugActivity.onPause(): " + getClass().getSimpleName());
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(CLASS_NAME, "DebugActivity.onStop(): " + getClass().getSimpleName());
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(CLASS_NAME, "DebugActivity.onDestroy(): " + getClass().getSimpleName());
        super.onDestroy();
    }
}