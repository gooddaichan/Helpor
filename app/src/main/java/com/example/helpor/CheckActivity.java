package com.example.helpor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CheckActivity extends AppCompatActivity {
    static int[] y={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    // Mapのキー
    private final String[] FROM = {"title","name","check"};
    // リソースのコントロールID
    private final int[] TO = {R.id.textView, R.id.textView2,R.id.checkBox};

    // カスタムアダプター
    private class MyAdapter extends  SimpleAdapter{

        // 外部から呼び出し可能なマップ
        public Map<Integer,Boolean> checkList = new HashMap<>();

        public MyAdapter(Context context, List<? extends Map<String, ?>> data,
                         int resource, String[] from, int[] to) {
            super(context, data, resource, from, to);

            // 初期値を設定する
            for(int i=0; i<data.size();i++){
                Map map = (Map)data.get(i);
                checkList.put(i,(Boolean)map.get("check"));
            }
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view = super.getView(position, convertView, parent);
            CheckBox ch = (CheckBox) view.findViewById(R.id.checkBox);

            // チェックの状態が変化した場合はマップに記憶する
            ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    checkList.put(position,isChecked);
                }
            });
            return view;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        ListView lv = (ListView) findViewById(R.id.listView2);

        // リストデータの生成
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();

        map.put("name","腹痛");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","腹部不快感");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","吐き気");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","嘔吐");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","胸やけ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","げっぷ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","肛門からの出血");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","血べん");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","便秘");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","下痢");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","便が細くなる");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","残便感");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","貧血");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","咳");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","呼吸困難");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","息切れ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","息苦しさ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","体重減少");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","たん");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","血たん");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","胸の痛み");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","性行為時の不正出血");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","臭くて赤いオリモノ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","骨盤の痛み");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","下腹部の痛み");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","血便");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","足のむくみ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","乳腺のしこり");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","乳頭からの分泌物");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","乳頭や乳輪部のただれ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","乳房のえくぼ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","皮膚の変化");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","わきの下の腫れやシコリ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","腹水");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","体のむくみ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","異常な程の喉の渇き");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","糖尿");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","足のつり");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","圧迫感");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","絞扼感");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","腕、肩、歯、あごの痛み");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","憂鬱、不安、意欲、集中力低下、イライラ");
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","頭痛、動悸、めまい" );
        map.put("check",false);
        list.add(map);

        map =  new HashMap<>();
        map.put("name","倦怠感");
        map.put("check",false);
        list.add(map);

        // アダプターの設定
        MyAdapter adapter = new MyAdapter(CheckActivity.this,
                list,R.layout.check2,FROM,TO);
        lv.setAdapter(adapter);

        // イベント
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //CheckActivity.this.setTitle(String.valueOf(position)+"番目がクリックされました。");
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // リストビューのチェック状態をログに出力する
                ListView lv = (ListView) findViewById(R.id.listView2);
                for(int i = 0;i < lv.getCount();i++) {
                    MyAdapter adapter = (MyAdapter)lv.getAdapter();
                    View view = adapter.getView(i,null,lv);
                    TextView tv = (TextView) view.findViewById(R.id.textView);

                    if(adapter.checkList.get(i)) {
                        y[i]=1;
                        Log.i("MyTAG", i + "はtrueです。");
                    }else {
                        y[i]=0;
                        Log.i("MyTAG", i + "はfalseです。");
                    }
                }
                Intent intent = new Intent(getApplication(),ChecksubActivity.class);
                startActivity(intent);
            }
        });
    }
}
