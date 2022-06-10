package com.example.classworkrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.name);
        CarsAdapter adapter = new CarsAdapter(cars);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        cars = new ArrayList<>();
        cars.add("Silvia");
        cars.add("Skyline");
        cars.add("Mark 2");
        cars.add("Tundra");
        cars.add("Crysler");
        cars.add("Subaru WRX STI");
        
    }
}