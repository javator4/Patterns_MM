package com.sda.singleton;

class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    static synchronized Singleton getInstance(){
        if (null == instance) {
            instance = new Singleton();
            System.out.println("Create object");
        }
        return instance;
    }
}
