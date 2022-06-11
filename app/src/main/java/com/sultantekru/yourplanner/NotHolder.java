package com.sultantekru.yourplanner;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotHolder extends RecyclerView.ViewHolder {
    public TextView baslik;
    public TextView not;
    public NotHolder(@NonNull View itemView) {
        super(itemView);
        baslik=itemView.findViewById(R.id.notkartbaslik);
        not=itemView.findViewById(R.id.notkartnot);
    }
}
