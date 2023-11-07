package com.caoliang.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        //ModerFactory factory = new ModerFactory();
        MagicFatory factory = new MagicFatory();

        Food food = factory.createFood();
        Weapon weapon = factory.createWeapon();
        Wheel wheel = factory.createWheel();

        food.pirntName();
        weapon.shoot();
        wheel.go();

    }
}
