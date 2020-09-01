package com.example.ezfind.HelperClasses.MyRequests;

public class MyRequestsHelperClass {

    int image;
    String title , date , description;

    public MyRequestsHelperClass(int image, String title, String date, String description) {
        this.image = image;
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
