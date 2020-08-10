package com.fenght.releasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.fenght.moduletest.AddTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(AddTest.addition(1,2,3,4) + "");
    }
}
