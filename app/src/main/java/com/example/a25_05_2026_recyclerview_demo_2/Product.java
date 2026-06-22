package com.example.a25_05_2026_recyclerview_demo_2;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;
    private String productImage;

    public Product(){
        this.productId = 100;
        this.productName = "Product 1";
        this.productPrice = 1000;
        this.productImage = "Default";
    }

    public Product(int pId, String pName, int proPrice, String pImage){
        this.productId = pId;
        this.productName = pName;
        this.productPrice = proPrice;
        this.productImage = pImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productImage='" + productImage + '\'' +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
