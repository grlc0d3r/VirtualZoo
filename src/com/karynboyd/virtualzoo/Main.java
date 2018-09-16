package com.karynboyd.virtualzoo;

public class Main {

    public static void main(String[] args) {
        Animal feline = new Animal("cat", "meow");
        System.out.println("The " + feline.getType() + " says " + feline.getSound());
    }

}
