package com.example.demo.Model;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // Sử dụng Integer thay vì int để tránh lỗi null

    private String name;
    private String brand;
    private double price;
    private String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;
    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageDate;

    // Constructor mặc định
    public Product() {}

    // Constructor với tham số
    public Product(boolean available, String brand, String category, Integer id, byte[] imageDate, String imageName, String imageType, String name, double price, int quantity, Date releaseDate) {
        this.available = available;
        this.brand = brand;
        this.category = category;
        this.id = id;
        this.imageDate = imageDate;
        this.imageName = imageName;
        this.imageType = imageType;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.releaseDate = releaseDate;
    }

    // Ghi đè phương thức toString nếu cần
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", category="
                + category + ", releaseDate=" + releaseDate + ", available=" + available + ", quantity=" + quantity
                + ", imageName=" + imageName + ", imageType=" + imageType + ", imageData=" + Arrays.toString(imageDate) + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

}