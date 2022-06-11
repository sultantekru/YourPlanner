package com.sultantekru.yourplanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodolistAdapter extends RecyclerView.Adapter<TodolistHolder> {

    @NonNull
    @Override
    public TodolistHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todolist_card,parent,false);
        return new TodolistHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodolistHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
