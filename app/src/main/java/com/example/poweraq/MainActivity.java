package com.example.poweraq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ShellUtils cmdrun = new ShellUtils();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShellUtils.execCommand("ppccli mw.aud.audreset",false);
        Log.d("poweraq","=== weiqifa === onCreate");
    }
}
