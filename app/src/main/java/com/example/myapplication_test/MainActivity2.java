package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private String TAG = "lcx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textView = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        String test_time = bundle.getString("test time:");
        String test_content = bundle.getString("test content:");
        String desc = String.format("time %s\n content %s",test_time,test_content);
        Log.i(TAG, "test_time: "+test_time+"test_content"+test_content);
        textView.setText(desc);
    }
}