package com.example.chalupajack.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.chalupajack.recyclerviewdemo.beans.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> items = new ArrayList<>();
    private RecyclerView recyclerView;
    private ItemsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new ItemsAdapter(items);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        populateItemDetails();
        mAdapter.notifyDataSetChanged();

    }

    private void populateItemDetails() {
        items.add(new Item("Broccoli", "Produce, Vegetable", 2, 0.79));
        items.add(new Item("Apples", "Produce, Fruit", 5, 0.35));
        items.add(new Item("Chicken Breast", "Meat, Poultry", 3, 1.85));
        items.add(new Item("Steak", "Meat, Beef", 2, 3.24));
        items.add(new Item("Olive Oil", "Pantry, Oil", 1, 7.89));
        items.add(new Item("Canned Soup", "Pantry, Soup", 3, 0.89));
        items.add(new Item("Iced Coffee", "Beverage, Coffee", 1, 4.89));
        items.add(new Item("Yogurt", "Dairy, Yogurt", 2, 1.05));
        items.add(new Item("Ice Cream", "Dessert, Ice Cream", 1, 4.69));
        items.add(new Item("Beer", "Beverage, Alcohol", 12, 0.45));
    }

}