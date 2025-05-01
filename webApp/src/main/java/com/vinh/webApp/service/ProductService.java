package com.vinh.webApp.service;

import com.vinh.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",999),
            new Product(102,"Samsung",899)));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int proId) {
        return products.stream().filter(p -> p.getProID() == proId).findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product){
        int index = 0;
        for(int i = 0; i< products.size();i++) {
            if (products.get(i).getProID() == product.getProID()) {
                index = i;
                products.set(index,product);
            }
        }
    }

    public Product deleteProduct(int proId){
        int index = 0;
        for(int i = 0; i< products.size();i++)
            if (products.get(i).getProID() == proId)
                index = i;
                return products.remove(index);

    }


}
