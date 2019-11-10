package com.sda.facade;

public class Product {

    public void getAll(){
        System.out.println("all products");
    }

    public void getByCategory(String category){
        System.out.println("Productks from categorhy: " + category);
    }
}
