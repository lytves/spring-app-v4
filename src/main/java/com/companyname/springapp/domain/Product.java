package com.companyname.springapp.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private  static  final Long serialVersionUID = 1L;
    private String description;
    private double price;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
