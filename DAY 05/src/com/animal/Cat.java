package com.animal;

//subClass com.animal.Cat
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    //    override from animal class
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
