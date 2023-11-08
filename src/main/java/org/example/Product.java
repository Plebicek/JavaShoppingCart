package org.example;

public class Product {
    private int id;
    private String name;
    private String label;
    private double price;

    public Product(int id, String name, double price) {
        //TODO: Doplnit konstruktor
        this.id = id;
        this.name = name;
        this.label = null;
        this.price = price;
    }

    public Product(int id, String name, String label, double price) {
        //TODO: Doplnit konstruktor
        this.id = id;
        this.name = name;
        this.label = label;
        this.price = price;
    }

    public int getId() {
        return this.id; //TODO: Doplnit správnou implementaci
    }

    public String getName() {
        return this.name; //TODO: Doplnit správnou implementaci
    }

    public double getPrice() {
        return this.price; //TODO: Doplnit správnou implementaci
    }
}
