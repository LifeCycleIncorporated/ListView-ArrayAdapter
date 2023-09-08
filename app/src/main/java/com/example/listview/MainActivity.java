package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        String[] countryNames = getResources().getStringArray(R.array.countryName);

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.simple_view,R.id.simple_textViewId,countryNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = countryNames[i];
                Toast.makeText(MainActivity.this, value+" is Clicked"+" "+(i+1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}