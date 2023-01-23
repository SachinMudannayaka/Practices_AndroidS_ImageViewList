package com.pmadcode11.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String week[]={"Sunday","Monday","Tuesday","WednesDay","Thursday","Friday","Saturday"};
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.single_line,R.id.textView,week);


        listView =findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);

    }
}