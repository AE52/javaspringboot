package com.proje.eren;

public class Araba {
    private String marka;
    private String model;
    private int yil;
    //constructor 
    public Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    //getter and setter
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
}
