package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    //TODO: Doplnit atributy
    private HashMap<Product, Integer> items = new HashMap<>();

    public void addItem(Product product, int quantity) {
        //TODO: Doplnit metodu
        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("nonono ");
            } else {
                items.put(product, quantity);
            }
        } catch (Error e) {
            System.out.println(e);
        }
    }

    public void removeItem(Product product) {
        //TODO: Doplnit metodu
        items.remove(product);
    }

    public double getTotalPrice() {
        float value = 0.f;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            value += product.getPrice() * quantity;
        }
        return value; //TODO: Doplnit správnou implementaci
    }
}