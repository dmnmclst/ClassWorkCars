package com.example.classworkrv;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsViewHolder> {
    private ArrayList<String> cars;


    public CarsAdapter(ArrayList<String> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        holder.bind(cars.get(position));

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
