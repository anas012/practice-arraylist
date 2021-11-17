package com.example.arraylist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list=findViewById(R.id.testlist);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.addnamebtn);
        EditText name=findViewById(R.id.plaintext1);

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
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                AlertDialog.Builder dialog=new AlertDialog.Builder(list.this);
            }
        });
    }

}