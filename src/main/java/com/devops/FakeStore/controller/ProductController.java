package com.devops.FakeStore.controller;

import com.devops.FakeStore.models.ProductModel;
import com.devops.FakeStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public ProductModel addProduct(@RequestBody ProductModel product){
        return productService.addProduct(product);
    }

    @GetMapping("/allProducts")
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }
}
