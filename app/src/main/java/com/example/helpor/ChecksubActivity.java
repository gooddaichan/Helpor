package com.example.helpor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ChecksubActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    String b1="",b2="",b3="",b4="",b5="",b6="",b7="",b8="",b9="";


    CheckActivity a=new CheckActivity();
    //a.y[0];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checksub);
        textView1 = (TextView) findViewById(R.id.btext1);
        textView2 = (TextView) findViewById(R.id.btext2);
        textView3 = (TextView) findViewById(R.id.btext3);
        textView4 = (TextView) findViewById(R.id.btext4);
        textView5 = (TextView) findViewById(R.id.btext5);
        textView6 = (TextView) findViewById(R.id.btext6);
        textView7 = (TextView) findViewById(R.id.btext7);
        textView8 = (TextView) findViewById(R.id.btext8);
        textView9 = (TextView) findViewById(R.id.btext9);

        if(a.y[0]==1||a.y[1]==1||a.y[2]==1||a.y[3]==1||a.y[4]==1||a.y[5]==1){
            b1="胃がん";
        }
        if(a.y[0]==1||a.y[6]==1||a.y[7]==1||a.y[8]==1||a.y[9]==1||a.y[10]==1||a.y[11]==1||a.y[12]==1){
            b2="大腸がん";
        }
        if(a.y[13]==1||a.y[14]==1||a.y[15]==1||a.y[16]==1||a.y[17]==1||a.y[18]==1||a.y[19]==1||a.y[20]==1){
            b3="肺がん";
        }
        if(a.y[0]==1||a.y[21]==1||a.y[22]==1||a.y[23]==1||a.y[24]==1||a.y[25]==1||a.y[26]==1){
            b4="子宮がん";
        }

        if(a.y[27]==1||a.y[28]==1||a.y[29]==1||a.y[30]==1||a.y[31]==1||a.y[32]==1){
            b5="乳がん";
        }

        if(a.y[33]==1||a.y[34]==1){
            b6="肝がん";
        }

        if(a.y[35]==1||a.y[36]==1||a.y[37]==1){
            b7="糖尿病";
        }

        if(a.y[4]==1||a.y[20]==1||a.y[38]==1||a.y[30]==1||a.y[39]==1||a.y[40]==1){
            b8="心筋梗塞";
        }

        if(a.y[41]==1||a.y[42]==1||a.y[43]==1){
            b9="精神疾患";
        }

        textView1.setText(b1);
        textView2.setText(b2);
        textView3.setText(b3);
        textView4.setText(b4);
        textView5.setText(b5);
        textView6.setText(b6);
        textView7.setText(b7);
        textView8.setText(b8);
        textView9.setText(b9);

    }
}
