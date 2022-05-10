package com.example.activitylifecycle;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","OnCreate Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","OnStart Method");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","OnResume Method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","OnPause Method");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","OnStop Method");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","OnRestart Method");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","OnDestroy Method");

    }
}