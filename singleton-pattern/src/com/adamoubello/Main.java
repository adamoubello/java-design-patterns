package com.adamoubello;

public class Main {
    public static void main(String[] args) {

        System.out.println("Test Singleton pattern");
        System.out.println("--------------------------------------------------");

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getInfo()); //Initial info class

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("New class info");

        System.out.println(singleton1.getInfo()); //New class info
        System.out.println(singleton2.getInfo()); //New class info

        System.out.println("--------------------------------------------------");

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE.getInstance();

        System.out.println(singletonEnum1.getInfo()); //Initial enum info

        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE.getInstance();
        singletonEnum2.setInfo("New enum info");

        System.out.println(singletonEnum1.getInfo()); // New enum info
        System.out.println(singletonEnum2.getInfo()); // New enum info
    }
}