package com.sda.facade;

public class App {

    public static void main(String[] args) {

        API api = new API(new User(), new Product(), new Cart());
        api.register();
        api.login();
        api.getCategoryByName("books");
    }
}
