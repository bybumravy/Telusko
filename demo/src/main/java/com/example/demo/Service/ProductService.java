package com.example.demo.Service;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.Product;
import com.example.demo.repositry.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    
    public List<Product> getProducts(){
        return productRepo.findAll();
    }
    public Product getProductByID(int proID) {
        return productRepo.findById(proID).orElse(null);
    }
    public void updateProduct(Product pro){
       productRepo.save(pro);
    }
    public void deleteProduct(int proID) {
       productRepo.deleteById(proID);
    }
    public Product addProduct(Product product, MultipartFile image) throws IOException {
        // TODO Auto-generated method stub
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageDate(image.getBytes());
        return productRepo.save(product);
    }
    
}
