package com.gurwinder.hardware;

import com.gurwinder.other.IDisplay;

public abstract class Computer implements IDisplay {


    private int id;
    private String manufacturerName;


    public Computer()
    {
        // Blank contructor
        System.out.println(" Computer Constructor");

    }

    /**
     *
     * @param manufacturerName
     */
    public Computer(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     */
    public Computer(int id, String manufacturerName) {
        this.id = id;
        this.manufacturerName = manufacturerName;
        System.out.println("Computer PArameter");
    }//Parameterised Constructor

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
