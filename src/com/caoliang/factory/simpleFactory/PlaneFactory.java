package com.caoliang.factory.simpleFactory;

public class PlaneFactory {

    public Moveable create(){
        //定义plane的相关配置
        return new Plane();
    }
}
