package com.example.ssh.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tableactivity);
        Log.d("MainActivity","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onstrat");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","ondestroy");
    }

}
