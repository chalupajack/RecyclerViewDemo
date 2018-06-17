package com.example.chalupajack.recyclerviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.chalupajack.recyclerviewdemo.beans.Item;

import java.util.List;


public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.CustomViewHolder> {
    private List<Item> items;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView itemName, quantity, itemCategory, avgcost;
        public CardView itemcard;

        public CustomViewHolder(View view) {
            super(view);
            itemcard = (CardView)view.findViewById(R.id.cv);
            itemName = (TextView) view.findViewById(R.id.itemName);
            itemCategory = (TextView) view.findViewById(R.id.itemCategory);
            quantity = (TextView) view.findViewById(R.id.quantity);
            avgcost = (TextView) view.findViewById(R.id.avgcost);
        }
    }

    public ItemsAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Item item = items.get(position);
        holder.itemName.setText(item.getItemName());
        holder.itemCategory.setText(item.getItemCategory());
        holder.quantity.setText(String.valueOf(item.getQuantity()));
        holder.avgcost.setText(String.valueOf(item.getAvgcost()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}