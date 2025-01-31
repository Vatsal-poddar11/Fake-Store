package com.devops.FakeStore.service;

import com.devops.FakeStore.models.ProductModel;
import com.devops.FakeStore.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel addProduct(ProductModel product) {
        log.info("Adding Product");
        ProductModel prod = productRepository.save(new ProductModel(product.getId(), product.getName(), product.getPrice(), product.getQuantity()));
        log.info("Product Added");
        return prod;
    }

    public List<ProductModel> getAllProducts() {
        log.info("Fetching All Products");
        List<ProductModel> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        log.info("Fetched All Products");
        return productList;
    }
}
