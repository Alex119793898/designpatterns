package com.caoliang.factory.simpleFactory;


public class Main {
    public static void main(String[] args) {
        Moveable car = new CarFactory().create();

        Moveable broom = new MagicFatory().create();

        Moveable plane = new PlaneFactory().create();

        car.go();
        broom.go();
        plane.go();


    }
}
