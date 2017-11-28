package com.example.helal.learninglanguageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);
        ListView list;
        String[] english= {"Where are you going?","What is your name?","My name is...",
                "How are you feeling?","I’m feeling good.","Are you coming?","Yes, I’m coming."};
        String[] frinsh= {"minto wuksus","tinnә oyaase'nә","oyaaset...","oyyisa","michәksәs?","kuchi achit"
                ,"әәnәs'aa?","hәә’ әәnәm"};
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
