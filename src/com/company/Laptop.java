package com.company;

public class Laptop {
    private String hard_drive;
    private String ram;
    private String display;

    public Laptop(){
        super();
    }

    public Laptop(String hard_drive, String ram, String display){
        this();
        this.hard_drive=hard_drive;
        this.ram=ram;
        this.display=display;
    }

    public String getHard_drive(){
        return hard_drive;
    }

    public void setHard_drive(String hard_drive){
        this.hard_drive=hard_drive;
    }

    public String getRam(){
        return ram;
    }

    public void setRam(String ram){
        this.ram=ram;
    }

    public String getDisplay(){
        return display;
    }

    public void setDisplay(String display){
        this.display=display;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Laptop [hard drive=").append(hard_drive).append(", RAM=").append(ram).append(", display=").append(display);
        return builder.toString();
    }
}
