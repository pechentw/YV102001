package com.example.yvtc.yv101303;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it);
    }
    public void click2(View v)
    {
        Intent it = new Intent();
        it.setAction("CALL123");
        startActivity(it);
    }
}
