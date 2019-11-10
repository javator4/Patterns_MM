package com.sda.facade;

public class API {

    private User user;
    private Product product;
    private Cart cart;

    public API(User user, Product product, Cart cart) {
        this.user = user;
        this.product = product;
        this.cart = cart;
    }

    public void login(){
        this.user.login();
    }

    public void register(){
        this.user.register();
    }

    public void getProducts(){
        this.cart.getItems();
    }

    public void getCategoryByName(String category){
        this.product.getByCategory(category);
    }

    public void getAllProducts(){
        this.product.getAll();
    }


}
