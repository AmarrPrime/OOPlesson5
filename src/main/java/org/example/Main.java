package org.example;

public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Fly");
            }
        };
        System.out.println(flyable.getClass().getName());
    }
}