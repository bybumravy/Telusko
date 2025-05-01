package com.vinh.webApp.controller;

import com.vinh.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.vinh.webApp.model.Product;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product.toString());
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        System.out.println("update");
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{proId}")
    public Product deleteProduct(@PathVariable int proId){
        return service.deleteProduct(proId);
    }

}
