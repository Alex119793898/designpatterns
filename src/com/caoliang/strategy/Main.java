package com.caoliang.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        //Sorter sorter = new Sorter();
        //sorter.sort(a);
        //System.out.println(Arrays.toString(a));

        //Cat[] arrCat = {new Cat(2, 2), new Cat(6, 6), new Cat(3, 3)};
        //sorter.sort(arrCat);
        //System.out.println(Arrays.toString(arrCat));

        Sorter<Dog> sorter = new Sorter<>();
        Dog[] arrDog = {new Dog(3), new Dog(6), new Dog(1), new Dog(2)};
        //sorter.sort(arrDog, new DogComparator());
        sorter.sort(arrDog, (o1,o2)->{
            if(o1.food < o2.food) return -1;
            else if (o1.food > o2.food) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(arrDog));

        Sorter<Cat> sorter1 = new Sorter<>();
        Cat[] arrCat = {new Cat(2, 2), new Cat(6, 6), new Cat(3, 3)};
        //sorter1.sort(arrCat, new CatComparator());
        sorter1.sort(arrCat, (o1, o2) -> {
            if(o1.weight < o2.weight) return -1;
            else if (o1.weight > o2.weight) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(arrCat));
    }
}
