package com.caoliang.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {9, 2, 3, 5, 7, 1, 4};
        Sorter sorter = new Sorter();
        //sorter.sort(a);
        System.out.println(Arrays.toString(a));

        Cat[] arrCat = {new Cat(2, 2), new Cat(6, 6), new Cat(3, 3)};
        sorter.sort(arrCat);
        System.out.println(Arrays.toString(arrCat));

        Dog[] arrDog = {new Dog(3), new Dog(6), new Dog(1), new Dog(2)};
        sorter.sort(arrDog);
        System.out.println(Arrays.toString(arrDog));
    }
}
