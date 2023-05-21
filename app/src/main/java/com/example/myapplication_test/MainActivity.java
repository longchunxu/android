package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static String TAG = "button";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView textView = findViewById(R.id.TextView);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        Log.i(TAG, "onClick1: ");
        bundle.putString("test time:" , DateUtil.getNowTime());
        bundle.putString("test content:" , textView.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
        Log.i(TAG, "onClick2: ");
    }
}