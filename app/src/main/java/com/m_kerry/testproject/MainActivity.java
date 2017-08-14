package com.m_kerry.testproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.main_button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this, "你点击了这个按钮", Toast.LENGTH_SHORT).show();
                //显示intent
//                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
                //隐式intent
//                Intent intent=new Intent("com.example.activitytest.ACTION_STRAT");
//                intent.addCategory("com.example.activitytest.MY_CATAGORY");
//                startActivity(intent);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }

}



