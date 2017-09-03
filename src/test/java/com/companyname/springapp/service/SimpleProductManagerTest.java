package com.companyname.springapp.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleProductManagerTest {

    private SimpleProductManager productManager;

    @Before
    public void setUp() throws Exception {
        productManager = new SimpleProductManager();
    }

    @Test
    public void testGetProductsWithNoProducts() {
        //productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }
}
