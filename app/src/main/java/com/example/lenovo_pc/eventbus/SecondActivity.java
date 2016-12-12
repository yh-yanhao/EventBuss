package com.example.lenovo_pc.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

public class SecondActivity extends AppCompatActivity {

    private Button butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        butt2 = (Button) findViewById(R.id.butt2);

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(
                        new Bean("我是老大"));
            }
        });
    }
}
