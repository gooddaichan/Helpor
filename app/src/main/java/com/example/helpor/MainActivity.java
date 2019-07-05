package com.example.helpor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = (Button) findViewById(R.id.button);//一つ目のボタン
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ListActivity.class);
                startActivity(intent);
            }
        });

        Button sendButton2 = (Button) findViewById(R.id.button2);//2つ目のボタン
        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CheckActivity.class);
                startActivity(intent);
            }
        });

        Button sendButton3 = (Button) findViewById(R.id.button3);//3つ目のボタン
        sendButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), InputActivity.class);
                startActivity(intent);
            }
        });
    }
}
