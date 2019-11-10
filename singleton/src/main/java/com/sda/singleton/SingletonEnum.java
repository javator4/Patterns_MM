package com.sda.singleton;

public enum SingletonEnum {

    INSTANCE;

    public void connection(){
        System.out.println("Singleton from enum");
    }


}
