package com.example.helal.learninglanguageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Numbers ,Family ,Color ,Phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numbers =(TextView) findViewById(R.id.numbers);
        Family = (TextView) findViewById(R.id.family);
        Color = (TextView) findViewById(R.id.color);
        Phrase = (TextView) findViewById(R.id.phrase);
    }
    public void setOnClickNumbers(View V){
        Intent intent = new Intent(MainActivity.this , NumbersActivity.class);
        startActivity(intent);

    }
    public void setOnClickFamily(View V){
        Intent intent = new Intent(MainActivity.this , FamilyActivity.class);
        startActivity(intent);
    }
    public void setOnClickColor(View V){
        Intent intent = new Intent(MainActivity.this , ColorActivity.class);
        startActivity(intent);
    }
    public void setOnClickPrase(View V){
        Intent intent = new Intent(MainActivity.this , PhraseActivity.class);
        startActivity(intent);
    }
}
