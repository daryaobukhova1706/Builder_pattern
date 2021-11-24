package com.company;

public class WorseLaptopBuilder implements LaptopBuilder{
    private String hard_drive;
    private String ram;
    private String display;

    public WorseLaptopBuilder() {
        super();
    }

    @Override
    public LaptopBuilder doHard_drive() {
        System.out.println("Assembling hard drive of the worse model");
        this.hard_drive = "120 Gb";
        return this;
    }

    @Override
    public LaptopBuilder doRam() {
        System.out.println("Assembling RAM of the worse model");
        this.ram = "2 Gb";
        return this;
    }

    @Override
    public LaptopBuilder doDisplay() {
        System.out.println("Assembling display of the worse model");
        this.display = "8.9 / 1280*768";
        return this;
    }

    @Override
    public Laptop build() {
        Laptop laptop = new Laptop(hard_drive, ram, display);
        System.out.println("Laptop HP 2133 Mini-note is complete!");
        return laptop;

    }
}
