package com.gurwinder.hardware;

import com.gurwinder.other.IDisplay;

public abstract class Computer implements IDisplay {


    private int id;
    private String manufacturerName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


}
