package com.example.hk_th.toyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView toy_list;
    String[] toys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toy_list = findViewById(R.id.toy_names);

        toys= toyBox.getToyNames();
        for(String toys:toys){

            toy_list.append(toys + "\n\n\n");
        }

    }
}
