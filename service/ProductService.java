package com.spring.security.login.service;

import com.spring.security.login.entity.Product;
import com.spring.security.login.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepository respository;

    public Product saveProduct(Product product){

        return respository.save(product);
    }
    public List<Product> getProducts(){

        return respository.findAll();
    }
    public String deleteProduct(int id){
         respository.deleteById(id);
         return "product removed......!"+id;
    }
    public Product updateProduct(Product product ){
        Product existingProduct=respository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return respository.save(existingProduct);
    }
}
