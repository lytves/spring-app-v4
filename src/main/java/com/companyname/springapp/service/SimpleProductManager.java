package com.companyname.springapp.service;

import com.companyname.springapp.domain.Product;

import java.io.Serializable;
import java.util.List;

public class SimpleProductManager implements ProductManager, Serializable{

    private static final long serialVersionUID = 1L;

    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException();
    }

    public List<Product> getProducts() {
        throw new UnsupportedOperationException();
    }

    public void setProducts(List<Product> products) {
        throw new UnsupportedOperationException();
    }
}
