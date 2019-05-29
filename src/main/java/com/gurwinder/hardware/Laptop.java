package com.gurwinder.hardware;

public class Laptop extends  Computer{
    private String screensize;
    private Float weight;


    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Laptop() {
    }

    /**
     *
     * @param screensize
     * @param weight
     */
    public Laptop(String screensize, Float weight) {
        this.screensize = screensize;
        this.weight = weight;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param screensize
     * @param weight
     */
    public Laptop(int id, String manufacturerName, String screensize, Float weight) {
        super(id, manufacturerName);
        this.screensize = screensize;
        this.weight = weight;
    }



    @Override
    public void display() {

    }
}
