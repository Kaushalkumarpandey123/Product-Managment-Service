package com.product.ProductService.service;

import com.product.ProductService.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void getAllProducts(){
        productDao.findAll();
    }

}
