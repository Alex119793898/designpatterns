package com.caoliang.factory.simpleFactory;

public class MagicFatory {
    public Moveable create(){
        // 定义broom的相关设置
        return new Broom();
    }
}
