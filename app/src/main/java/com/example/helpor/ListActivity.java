package com.example.helpor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> items;
    String a="a";
    String [][]b={{"わ","あいあいあ"},{"d","f"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView) findViewById(R.id.listView);

        items = new ArrayList<>();
        items.add("愛日病院\n徳島県徳島市佐古五番町４３");
        items.add("あすなろ診療所\n徳島県徳島市佐古一番町１０２");
        items.add("伊月病院\n徳島県徳島市徳島町２５４");
        items.add("おおしま内科皮膚科クリニック\n徳島県徳島市佐古二番町5-20");
        items.add("おかがわ内科・小児科\n徳島県徳島市住吉１丁目１０１９");
        items.add("沖の洲病院\n徳島県徳島市城東町１丁目８８");
        items.add("小倉診療所\n徳島県徳島市蔵本町２丁目２７");
        items.add("かさまつ在宅クリニック\n徳島県徳島市仲之町２丁目８２");
        items.add("川島病院\n徳島県徳島市北佐古一番町１３９");
        items.add("木下クリニック\n徳島県徳島市福島１丁目３４");
        items.add("木下病院\n徳島県徳島市南末広町４７０");
        items.add("協栄内科\n徳島県徳島市中昭和町２丁目");
        items.add("共立病院\n徳島県徳島市八万町橋本９２１");
        items.add("くどう内科クリニック\n徳島県徳島市城南町４丁目１５");
        items.add("こおりクリニック\n徳島県徳島市新浜本町１丁目７６６");
        items.add("近藤内科病院\n徳島県徳島市西新浜町１丁目６２５");
        items.add("三河循環器科内科\n徳島県徳島市 南内町141");
        items.add("斎藤内科循環器科\n徳島県徳島市城南町１丁目８１０");
        items.add("城西病院\n徳島県徳島市南矢三町３丁目１１２３");
        items.add("城南公園内科\n徳島県徳島市城南町３丁目５２２");
        items.add("城東整形外科内科\n徳島県徳島市福島１丁目６５８");
        items.add("助任診療所\n徳島県徳島市助任本町３丁目２０");
        items.add("住友医院\n徳島県徳島市勝占町下河原32-1");
        items.add("住友内科病院\n徳島県徳島市安宅２丁目３５");
        items.add("寺沢病院\n徳島県徳島市津田西町１丁目２３０");
        items.add("たおか内科病院\n徳島県徳島市城東町２丁目７６１");
        items.add("田岡病院\n徳島県徳島市万代町４丁目2番地２");
        items.add("高杉内科外科小児科脳外科\n徳島県徳島市国府町芝原天満２５１");
        items.add("たけひさ医院\n徳島県徳島市安宅１丁目８３７");
        items.add("たまき青空病院\n徳島県徳島市国府町早淵５６１");
        items.add("天満病院\n徳島県徳島市蔵本町１丁目５１");
        items.add("東洋病院\n徳島県徳島市北島田町１丁目１６０２");
        items.add("徳島大学病院\n徳島県徳島市蔵本町２丁目５０1");
        items.add("徳島県立中央病院\n徳島県徳島市蔵本町１丁目１０３");
        items.add("徳島市民病院\n徳島県徳島市北常三島町２丁目３４");
        items.add("徳島逓信病院\n徳島県徳島市伊賀町３丁目１９２");
        items.add("徳島健生病院\n徳島県徳島市下助任町４丁目９");
        items.add("豊田内科\n徳島県徳島市住吉２丁目２３５");
        items.add("中洲八木病院\n徳島県徳島市中洲町１丁目３１番地");
        items.add("中瀬病院\n徳島県徳島市応神町古川戎子野９７１");
        items.add("博愛記念病院\n徳島県徳島市勝占町惣田９");
        items.add("橋本病院\n徳島県徳島市中常三島町３丁目２２?１");
        items.add("林病院\n徳島県徳島市大原町東千代ケ丸１９５２");
        items.add("林内科\n徳島県徳島市中昭和町２丁目９４");
        items.add("日比野病院\n徳島県徳島市寺島本町東２丁目１４");
        items.add("文慶記念内科\n徳島県徳島市国府町中４９５");
        items.add("古川病院\n徳島県徳島市 寺島本町西１丁目３３ 第２中筋ビル");
        items.add("藤中内科医院\n徳島県徳島市昭和町１丁目２１");
        items.add("松永病院\n徳島県徳島市南庄町４丁目６３１");
        items.add("松村病院\n徳島県徳島市川内町鶴島１６２");
        items.add("真鍋医院\n徳島県徳島市下助任町３丁目１２");
        items.add("三木内科循環器クリニック\n徳島県徳島市佐古七番町５１");
        items.add("水の都記念病院\n徳島県徳島市北島田町１丁目４５２");
        items.add("村田整形外科医院\n徳島県徳島市鮎喰町２丁目９６３");
        items.add("松村病院\n徳島県徳島市川内町鶴島１６２");
        items.add("岡部内科クリニック\n徳島県徳島市川内町加賀須野４３７３");
        items.add("森岡病院\n徳島県徳島市八万町大野５１");
        items.add("善成病院\n徳島県徳島市佐古三番町７３");
        items.add("リハビリテーション大神子病院\n徳島県徳島市大原町大神子１９");
        items.add("城東整形外科内科\n徳島県徳島市福島１丁目６５８");
        items.add("徳島ブレストケアクリニック\n徳島県徳島市中島田町４丁目７７");
        items.add("徳島サクラクリニック\n徳島県徳島市下町本丁５９１");
        items.add("城西ビオスクリニック\n徳島県徳島市佐古一番町５?２");
        items.add("津田内科\n徳島県徳島市藍場町１丁目３２");
        items.add("山城クリニック\n 徳島県徳島市 山城西１-１８２-３");
        items.add("保岡クリニック論田病院\n徳島県徳島市論田町大江６１");
        items.add("鈴江病院\n徳島県徳島市佐古八番町４２２");
        items.add("リムズ徳島クリニック\n徳島県徳島市名東町２丁目５５９-１");
        items.add("虹の橋クリニック\n徳島県徳島市 中島田町３丁目６０-１");
        items.add("徳島県鳴門病院\n徳島県鳴門市撫養町黒崎字小谷３２");
        items.add("岩朝病院\n徳島県鳴門市撫養町立岩元地２８０");
        items.add("原田内科\n徳島県鳴門市大津町矢倉六ノ越５-９");
        items.add("あい愛診療所撫養\n徳島県鳴門市撫養町南浜浜田１３０");
        items.add("長岡整形外科\n徳島県徳島市南前川町４丁目３ ヴィラフェニックス城ノ内 2F");
        items.add("佐藤整形外科医院\n徳島県鳴門市撫養町南浜東浜２６５");
        items.add("板東診療所\n徳島県鳴門市大麻町板東東山田８-２");
        items.add("古林内科\n徳島県鳴門市大麻町板東永井８９");
        items.add("阿南協栄病院\n徳島県阿南市羽ノ浦町中庄蔵ノホケ３６");
        items.add("阿南医師会中央病院\n徳島県阿南市宝田町川原２番地");
        items.add("羽ノ浦整形外科内科病院\n徳島県阿南市羽ノ浦町宮倉芝生４０-１１");
        items.add("宮本病院\n徳島県阿南市羽ノ浦町古庄古野神４-１４");
        items.add("きくち医院\n徳島県阿南市新野町南宮ノ久保６７-４");
        items.add("島内科眼科医院\n徳島県阿南市富岡町東新町９９");
        items.add("原田病院\n徳島県阿南市富岡町あ石１４-１");
        items.add("岩城クリニック\n徳島県阿南市学原町上水田１１-１");




        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        MenuItem searchItem=menu.findItem(R.id.item_search);
        SearchView searchView=(SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText){
                ArrayList<String>templist=new ArrayList<>();
                for(String temp:items){
                    if(temp.toLowerCase().contains(newText.toLowerCase())){
                        templist.add(temp);
                    }
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(ListActivity.this,
                        android.R.layout.simple_list_item_1, templist);
                listView.setAdapter(adapter);
                return true;
            }
            @Override
            public boolean onQueryTextSubmit(String query){
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

}
