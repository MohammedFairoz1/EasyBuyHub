package com.easyBuyHub.productservice.service;

import com.easyBuyHub.productservice.doa.ProductDoa;
import com.easyBuyHub.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    Product product;
    @Autowired
    ProductDoa productDoa;
     public ResponseEntity<String> addProduct(Product product){
        productDoa.save(product);
        return new ResponseEntity<>("Successfully added ", HttpStatus.OK);
     }
}
