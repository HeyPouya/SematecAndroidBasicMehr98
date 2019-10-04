package com.sematec.sematecandroidbasicmehr98;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MYTAG", "in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MYTAG", "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG", "in onStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG", "in onStart");

    }
}
