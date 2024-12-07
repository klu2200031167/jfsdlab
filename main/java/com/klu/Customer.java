package com.klu;



public class Customer {
    private int id;
    private String name;

    // Default constructor (required for Spring to deserialize JSON)
    public Customer() {}

    // Parameterized constructor
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override toString for better logging or debugging
    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "'}";
    }
}

