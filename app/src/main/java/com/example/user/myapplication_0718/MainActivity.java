package com.example.user.myapplication_0718;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final static String DEBUG_TAG = "mainActivity"; //Set variable save debug tag

    @Override   //先重新定義 MainActivity 的東西, 再跑父類別(AppComatActivity)
    protected void onCreate(Bundle savedInstanceState) { //進入點,建構值
        super.onCreate(savedInstanceState); // 呼叫父類別的版本
        setContentView(R.layout.activity_main);     //Setting Layout
   //     setContentView(R.layout.new_layouttest);    //Try New Layout and put it in

        //Debug message
        int value = 1 ;
        Log.d(DEBUG_TAG,"value:" + value);

        Log.d(DEBUG_TAG, "Hit yourself"); //log.d(debug); log.v(verbose)
        //-----Log.d Output 較穩定, 但手續較繁複
        //-----Toast 有些不適用

        //remind User by little window
        //|----------------生成這個物件 -------------------------|.|-顯示-|
        Toast.makeText(this,"value:" + value, Toast.LENGTH_LONG).show();
    }
}
