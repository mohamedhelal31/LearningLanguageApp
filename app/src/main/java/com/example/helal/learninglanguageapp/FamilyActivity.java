package com.example.helal.learninglanguageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);
        ListView list;
        String[] english= {"father","mother","son","daughter","older brother","younger brother","older sister","younger sister","grandmother","grandfather"};
        String[] frinsh= {"әpә","әṭa","angsi","tune","taachi","chalitti","teṭe","kolliti","ama","paapa"};
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
