package com.caoliang.strategy;

public class Cat implements Comparable{
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Object o){
        Cat c = (Cat)o;
        if(weight < c.weight) return -1;
        if(weight > c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
