package com.example.demo.Model;

import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private String brand;
    private double price;
    private String category;
    private String releaseDate;
    private boolean available;
    private int quantity;
    private String imageName;
    private String imageType;
    private String imageBase64;  // Thay vì byte[], mình dùng String Base64 cho đẹp
    public ProductDTO(Integer id, String name, String brand, double price, String category, String releaseDate,
            boolean available, int quantity, String imageName, String imageType, String imageBase64) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.available = available;
        this.quantity = quantity;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageBase64 = imageBase64;
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

    public ProductDTO() {
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
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

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDTO{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", brand=").append(brand);
        sb.append(", price=").append(price);
        sb.append(", category=").append(category);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", available=").append(available);
        sb.append(", quantity=").append(quantity);
        sb.append(", imageName=").append(imageName);
        sb.append(", imageType=").append(imageType);
        sb.append(", imageBase64=").append(imageBase64);
        sb.append('}');
        return sb.toString();
    }
    
}
