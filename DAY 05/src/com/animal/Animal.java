package com.animal;

//Super class com.animal.Animal
public class Animal {
    protected String name;
    protected int age;

    //    constructor of animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to print sound of animal
    public void makeSound() {
        System.out.println("MakeSound");
    }

    void display() {
        System.out.println("com.animal.Animal " + name + " is " + age + " years old.");
    }

}
