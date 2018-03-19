package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.os.Bundle;
import org.jetbrains.annotations.Nullable;
import android.util.Log;

/**
 * Created by a2016952134 on 08/03/18.
 */

public class DebugActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i("onCreate", "OnCreate ON");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("onResume", "onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("onRestart", "onRestart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("onPause", "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("onStop", "onStop");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("onStart", "onStart");
    }

}
