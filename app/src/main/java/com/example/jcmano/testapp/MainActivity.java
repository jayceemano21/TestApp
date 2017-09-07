package com.example.jcmano.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        //setContentView(R.layout.activity_main);
        Log.d("LOG","onStart was executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        //setContentView(R.layout.activity_main);
        Log.d("LOG","onPause was executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        //setContentView(R.layout.activity_main);
        Log.d("LOG","onResume was executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //setContentView(R.layout.activity_main);
        Log.d("LOG", "onStop was executed");

    }
}
