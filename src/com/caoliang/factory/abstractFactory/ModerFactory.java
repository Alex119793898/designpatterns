package com.caoliang.factory.abstractFactory;


public class ModerFactory extends AbstractFactory{
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Wheel createWheel() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }
}
