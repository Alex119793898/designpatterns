package com.caoliang.factory.simpleFactory;

public class CarFactory {

    public Moveable create(){
        // 定义car的相关设置
        return new Car();
    }
}
