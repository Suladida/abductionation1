package com.example.codeclan.abductionationservice.models.energy;

public abstract class Energy {

    String name;
    String type;

    public Energy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

//    todo: create iConvert interface.

