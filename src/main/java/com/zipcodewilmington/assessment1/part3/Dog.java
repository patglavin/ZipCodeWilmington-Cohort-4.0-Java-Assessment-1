package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.age = 0;
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.age = 0;
        this.name = "Dog name";
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
