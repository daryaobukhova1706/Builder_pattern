package com.company;

public interface LaptopBuilder {
    public LaptopBuilder doHard_drive();
    public LaptopBuilder doRam();
    public LaptopBuilder doDisplay();
    public Laptop build();
}
