package com.example.yvtc.yv101802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        Intent it = getIntent();
        String str = it.getStringExtra("mydata");
        tv2.setText(str);
    }
}
