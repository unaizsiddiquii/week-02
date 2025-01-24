package com.animal;

//subClass com.animal.Dog
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    //    override from animal class
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

}
