package com.example.helpor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {
    String spinnerItems[] = {"精神疾患","脳卒中", "心筋梗塞", "胃がん", "大腸がん","肺がん","子宮がん","乳がん","肝がん","糖尿病"};
    TextView textView;
    //Button Button = (Button) findViewById(R.id.inputbutton1);
    int bn1=0,bn2=0,bn3=0,bn4=0,bn5=0,bn6=0,bn7=0,bn8=0,bn9=0,bn10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        textView = (TextView) findViewById(R.id.text_view);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // ArrayAdapter
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinnerItems);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // spinner に adapter をセット
        spinner.setAdapter(adapter);

        // リスナーを登録
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            //　アイテムが選択された時
            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int position, long id) {
                Spinner spinner = (Spinner)parent;
                String item = (String)spinner.getSelectedItem();
                if(item=="精神疾患"){
                    bn1=1;
                    //textView.setText(item);
                }
                if(item=="脳卒中"){
                    bn2=1;
                    //textView.setText(item);
                }
                if(item=="心筋梗塞"){
                    bn3=1;
                    //textView.setText(item);
                }
                if(item=="胃がん"){
                    bn4=1;
                    //textView.setText(item);
                }
                if(item=="大腸がん"){
                    bn5=1;
                    //textView.setText(item);
                }
                if(item=="肺がん"){
                    bn6=1;
                    //textView.setText(item);
                }
                if(item=="子宮がん"){
                    bn7=1;
                    //textView.setText(item);
                }
                if(item=="乳がん"){
                    bn8=1;
                    //textView.setText(item);
                }
                if(item=="肝がん"){
                    bn9=1;
                    //textView.setText(item);
                }
                if(item=="糖尿病"){
                    bn10=1;
                    //textView.setText(item);
                }
                //textView.setText(item);
            }

            //　アイテムが選択されなかった
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });
        Button Button = (Button) findViewById(R.id.inputbutton1);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bn1==1){
                    bn1=0;
                    Intent intent = new Intent(getApplication(), InputsubActivity.class);
                    startActivity(intent);
                }
                if(bn2==1){
                    bn2=0;
                 Intent intent = new Intent(getApplication(), Inputsub2Activity.class);
                 startActivity(intent);
                }
                if(bn3==1){
                    bn3=0;
                    Intent intent = new Intent(getApplication(), Inputsub3Activity.class);
                    startActivity(intent);
                }
                if(bn4==1){
                    bn4=0;
                    Intent intent = new Intent(getApplication(), Inputsub4Activity.class);
                    startActivity(intent);
                }
                if(bn5==1){
                    bn5=0;
                    Intent intent = new Intent(getApplication(), Inputsub5Activity.class);
                    startActivity(intent);
                }
                if(bn6==1){
                    bn6=0;
                    Intent intent = new Intent(getApplication(), Inputsub6Activity.class);
                    startActivity(intent);
                }
                if(bn7==1){
                    bn7=0;
                    Intent intent = new Intent(getApplication(), Inputsub7Activity.class);
                    startActivity(intent);
                }
                if(bn8==1){
                    bn8=0;
                    Intent intent = new Intent(getApplication(), Inputsub8Activity.class);
                    startActivity(intent);
                }
                if(bn9==1){
                    bn9=0;
                    Intent intent = new Intent(getApplication(), Inputsub9Activity.class);
                    startActivity(intent);
                }
                if(bn10==1){
                    bn10=0;
                    Intent intent = new Intent(getApplication(), Inputsub10Activity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
