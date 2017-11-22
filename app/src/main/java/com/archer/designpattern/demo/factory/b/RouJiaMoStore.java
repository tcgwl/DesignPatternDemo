package com.archer.designpattern.demo.factory.b;

/**
 * 工厂方法模式
 * 定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。
 */
public abstract class RouJiaMoStore {
    /**
     * 定义一个创建对象的接口
     */
    protected abstract RouJiaMo createRouJiaMo(String type);
    protected abstract RouJiaMoYLFactory createRouJiaMoYLFactory();

    /**
     * 根据传入类型卖不同的肉夹馍
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        if (rouJiaMo != null) {
            rouJiaMo.prepare(createRouJiaMoYLFactory());
            rouJiaMo.fire();
            rouJiaMo.pack();
        }
        return rouJiaMo;
    }
}
