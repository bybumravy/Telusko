package com.vinh.webApp.model;


import org.springframework.stereotype.Component;

@Component
public class Product {

    private int proID;
    private String proName;
    private int price;

    public Product() {
    }

    public Product(int proID, String proName, int price) {
        this.proName = proName;
        this.proID = proID;
        this.price = price;
    }

    public int getProID() {
        return proID;
    }

    public int getPrice() {
        return price;
    }

    public String getProName() {
        return proName;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proID=" + proID +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
