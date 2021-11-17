package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list=findViewById(R.id.testlist);
        ArrayList<String>friendslist=new ArrayList<String >();
        friendslist.add("Fama");
        friendslist.add("Mujtaba");
        friendslist.add("Areeb");
        friendslist.add("Arslan");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,friendslist);
        list.setAdapter(arrayAdapter);
    }

}