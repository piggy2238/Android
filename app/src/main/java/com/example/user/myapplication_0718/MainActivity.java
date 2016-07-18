package com.example.user.myapplication_0718;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override   //先重新定義 MainActivity 的東西, 再跑父類別(AppComatActivity)
    protected void onCreate(Bundle savedInstanceState) { //進入點,建構值
        super.onCreate(savedInstanceState); // 呼叫父類別的版本
        setContentView(R.layout.activity_main);     //Setting Layout
   //     setContentView(R.layout.new_layouttest);    //Try New Layout and put it in

    }
}
