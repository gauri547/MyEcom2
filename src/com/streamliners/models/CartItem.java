package com.streamliners.models;

public class CartItem {
    String name;
    float unitPrice ,qty;

    float cost(){
        return unitPrice * qty;
    }

    public CartItem(String name, float untPrice, float qty) {
        this.name = name;
        this.unitPrice = untPrice;
        this.qty = qty;
    }


    @Override
    public String toString() {
        return String.format(" Unit Price : %.2f, Quantity %.2f, Total %.2f\n",unitPrice,qty,unitPrice * qty );
    }
}
