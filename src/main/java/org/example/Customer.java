package org.example;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        //TODO: Doplnit konstruktor
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return this.id; //TODO: Doplnit správnou implementaci
    }

    public String getName() {
        return this.name; //TODO: Doplnit správnou implementaci
    }

    public String getEmail() {
        return this.email; //TODO: Doplnit správnou implementaci
    }
}
