package com.sultantekru.yourplanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotAdapter extends RecyclerView.Adapter<NotHolder> {


    @NonNull
    @Override
    public NotHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.not_card,parent,false);
        return new NotHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotHolder holder, int position) {
        holder.baslik.setText("");
        holder.not.setText("");
    }

    @Override
    public int getItemCount() {

        return 5;
    }
}
