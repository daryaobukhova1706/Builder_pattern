package com.company;

public class BetterLaptopBuilder implements LaptopBuilder{
    private String hard_drive;
    private String ram;
    private String display;

    public BetterLaptopBuilder() {
        super();
    }

    @Override
    public LaptopBuilder doHard_drive() {
        System.out.println("Assembling hard drive of the better model");
        this.hard_drive = "160 Gb";
        return this;
    }

    @Override
    public LaptopBuilder doRam() {
        System.out.println("Assembling RAM of the better model");
        this.ram = "8 Gb";
        return this;
    }

    @Override
    public LaptopBuilder doDisplay() {
        System.out.println("Assembling display of the better model");
        this.display = "10.1 / 1024*600";
        return this;
    }

    @Override
    public Laptop build() {
        Laptop laptop = new Laptop(hard_drive, ram, display);
        System.out.println("Laptop Acer Aspire One D250-0Bk is complete!");
        return laptop;

    }
}
