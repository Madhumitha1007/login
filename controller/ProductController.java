package com.spring.security.login.controller;

import com.spring.security.login.entity.Product;
import com.spring.security.login.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

     @PostMapping("/saveProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @GetMapping("/get-product")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @DeleteMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
    @PutMapping("/update-product")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

}
