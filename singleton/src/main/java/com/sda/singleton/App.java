package com.sda.singleton;

/**
 * Hello world!
 *
 */
public class App {

    static class Task1 implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
            SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
            singletonEnum.connection();
        }
    }



        static class  Task2 implements Runnable {

            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
                singletonEnum.connection();
                System.out.println(singleton);
            }
        }

        public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();

            System.out.println(singleton);


            Thread thread1 = new Thread(new Task1());
            Thread thread2 = new Thread(new Task2());

            thread1.start();
            thread2.start();






        }
    }
