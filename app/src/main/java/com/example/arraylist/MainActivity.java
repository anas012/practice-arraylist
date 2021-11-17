package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.addnamebtn);
        EditText name=findViewById(R.id.plaintext1);
        ListView list=findViewById(R.id.testlist);
        ArrayList<String>friendslist=new ArrayList<String >();
        friendslist.add("frnd1");
        friendslist.add("frnd2");
        friendslist.add("frnd3");
        friendslist.add("frnd4");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,friendslist);
        list.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=name.getText().toString();
            friendslist.add(a);
            arrayAdapter.notifyDataSetChanged();
            }
        });
    }

}