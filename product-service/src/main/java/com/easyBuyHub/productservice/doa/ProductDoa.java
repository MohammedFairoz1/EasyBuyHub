package com.easyBuyHub.productservice.doa;

import com.easyBuyHub.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDoa extends JpaRepository<Product, Integer> {

}
