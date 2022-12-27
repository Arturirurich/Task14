package com.example.arturaandkakatya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> posts = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            if(i == 0){
                posts.add("Красный");
            }
            if(i == 1){
                posts.add("Оранжевый");
            }
            if(i == 2){
                posts.add("Желтый");
            }
            if(i == 3){
                posts.add("Зеленый");
            }
            if(i == 4){
                posts.add("Голубой");
            }
            if(i == 5){
                posts.add("Синий");
            }
            if(i == 6){
                posts.add("Фиолетовый");
            }
        }


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, posts);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String n = listView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Номер " + ++position + " - " + n, Toast.LENGTH_SHORT).show();
            }
        });

    }
}