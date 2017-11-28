package com.example.helal.learninglanguageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);
        ListView list;
        String[] english= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
            String[] frinsh= {"lutti","otiiko","tolookosu","oyyisa","massokka","temmokka","kenekaku","kawinta","wo’e","na’aacha"};
        Words words ;
        ArrayList<Words> numberList = new ArrayList<Words>();
        for (int i = 0 ; i<english.length;i++) {
            words = new Words(english[i], frinsh[i]);
            numberList.add(words);
        }

        WordsAdapter adapter = new WordsAdapter (this ,numberList );
        list =(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);


    }
}
