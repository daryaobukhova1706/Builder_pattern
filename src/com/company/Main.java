package com.company;

public class Main {

    public static void main(String[] args) {
        LaptopBuilder builder = new BetterLaptopBuilder();
        LaptopDirector director = new LaptopDirector(builder);
        Laptop laptop = director.manufactureLaptop();
        if (laptop != null) {
            System.out.println("Your laptop is ready and waiting for you <3!");
            System.out.println(laptop);
        }
    }
}
