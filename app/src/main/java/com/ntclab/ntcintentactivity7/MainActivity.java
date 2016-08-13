package com.ntclab.ntcintentactivity7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtV = (TextView) findViewById(R.id.textView);
        txtV.setText(getStringFromIntent("ntclab6"));
    }

    protected String getStringFromIntent(String keyValue) {
        Intent callerIntent = getIntent();
        String data = callerIntent.getStringExtra(keyValue);
        return data;
    }
}
