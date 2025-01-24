package com.animal;

//subClass com.animal.Bird
public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    //    override from animal class
    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
}
