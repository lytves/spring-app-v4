package com.companyname.springapp.service;

import com.companyname.springapp.domain.Product;

import java.io.Serializable;
import java.util.List;

public class SimpleProductManager implements ProductManager, Serializable{

    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public void increasePrice(int percentage) {

        //not implemented yet
        throw new UnsupportedOperationException();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
