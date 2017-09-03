package com.companyname.springapp.service;

import com.companyname.springapp.domain.Product;

import java.io.Serializable;
import java.util.List;

public class SimpleProductManager implements ProductManager, Serializable{

    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public void increasePrice(int percentage) {

        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
