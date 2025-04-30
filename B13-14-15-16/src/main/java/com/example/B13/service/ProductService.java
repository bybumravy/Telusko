package com.example.B13.service;

import com.example.B13.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000)));

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100,"No Item", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == product.getProdId()){
                index = i;
                products.set(index, product);
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for(int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                products.remove(index);
            }
        }
    }
}
