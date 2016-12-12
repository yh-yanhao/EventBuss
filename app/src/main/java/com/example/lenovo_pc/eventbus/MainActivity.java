package com.example.lenovo_pc.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注册EventBus
        EventBus.getDefault().register(this);

        bt = (Button) findViewById(R.id.butt1);
        tv = (TextView) findViewById(R.id.tv);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    public void onEventMainThread(Bean b) {

        String str = "onEventMainThread收到了消息：" + b.getName();
        tv.setText(str);
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //反注册EventBus
        EventBus.getDefault().unregister(this);
    }
}
