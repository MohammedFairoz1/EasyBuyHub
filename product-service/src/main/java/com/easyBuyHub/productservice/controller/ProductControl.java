package com.easyBuyHub.productservice.controller;

import com.easyBuyHub.productservice.model.Product;
import com.easyBuyHub.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductControl {
    @Autowired
    ProductService productService;
    @PostMapping("add/")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

}
