package org.example;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Owner owner = new Owner();
        cat.setName("Перчик");
        cat.setAge(6);
        owner.setName("Зоя");
        cat.setOwner(owner);
        cat.greet();
    }
}