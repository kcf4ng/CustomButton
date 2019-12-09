package com.example.custombutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int i = 0 ;

    private View.OnClickListener btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i++;
            btn.setText2(""+i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialComponent();

    }

    private void InitialComponent() {
        btn = new MyImageButton(this,R.drawable.ic_launcher_foreground,"待\n處\n理","0");

        llbtDataConfig  = findViewById(R.id.btn);
        llbtDataConfig.addView(btn);

        btn.setOnClickListener(btn_click);


    }

    private LinearLayout llbtDataConfig = null;
    MyImageButton btn;
}
