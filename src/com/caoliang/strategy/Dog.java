package com.caoliang.strategy;

public class Dog implements Comparable{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    public int compareTo(Object o){
        Dog d = (Dog)o;
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
