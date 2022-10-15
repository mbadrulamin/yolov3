package com.enigma.yolov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {


    private static String TAG = "MainActivity";
    static{
        if (OpenCVLoader.initDebug()){
            Log.d(TAG, "opencv installed successfully");
        }else{
            Log.d(TAG, "opencv is not installed");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}