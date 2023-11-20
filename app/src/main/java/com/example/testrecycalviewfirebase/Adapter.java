package com.example.testrecycalviewfirebase;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapter extends FirebaseRecyclerAdapter<Model,Adapter.myViewHolder> {

    public Adapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull Model model) {
        holder.FoodName.setText(model.getFoodName());
        holder.FoodDesCrip.setText(model.getFoodDesCrip());
        holder.FoodPrice.setText(model.getFoodPrice());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        TextView FoodName, FoodDesCrip, FoodPrice;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            FoodName = (TextView)itemView.findViewById(R.id.tvName);
            FoodDesCrip = (TextView) itemView.findViewById(R.id.tvDescrip);
            FoodPrice = (TextView) itemView.findViewById(R.id.tvPrice);
        }
    }

}
