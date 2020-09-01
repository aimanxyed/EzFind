package com.example.ezfind.AllProducts;

public class AllProductsHelperClass {
    int image;
    String title, desc1 , desc2 , price;

    public AllProductsHelperClass(int image, String title, String desc1, String desc2, String price) {
        this.image = image;
        this.title = title;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc1() {
        return desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public String getPrice() {
        return price;
    }
}
