package com.example.chalupajack.recyclerviewdemo.beans;

public class Item {
    private String itemName;
    private String itemCategory;
    private Integer quantity;
    private Double avgcost;

    public Item(String itemName, String itemCategory, Integer quantity, Double avgcost) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.quantity = quantity;
        this.avgcost = avgcost;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getAvgcost() {
        return avgcost;
    }
}
