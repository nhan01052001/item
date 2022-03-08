package com.example.myapplication;

public class Items {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Items(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
