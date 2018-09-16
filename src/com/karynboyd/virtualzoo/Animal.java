package com.karynboyd.virtualzoo;

public class Animal {
    private String sound;
    private String type;

    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Animal() { }
    public Animal(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public void speak(String sound) {
        System.out.println("The " + type + " says " + sound);
    }
}
