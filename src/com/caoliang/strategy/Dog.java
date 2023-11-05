package com.caoliang.strategy;

public class Dog implements Comparable<Dog>{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    public int compareTo(Dog d){
        if(food < d.food) return -1;
        else if(food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
