package com.company;

public class LaptopDirector {
    private LaptopBuilder builder;

    public LaptopDirector(LaptopBuilder builder){
        super();
        this.builder=builder;
    }

    public Laptop manufactureLaptop(){
        return builder.doHard_drive().doRam().doDisplay().build();
    }
}
