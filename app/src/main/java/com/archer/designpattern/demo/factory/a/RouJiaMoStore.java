package com.archer.designpattern.demo.factory.a;

/**
 * 以组合的方式，让 Store 来使用 Factory
 * Store 只负责卖馍
 * 添加什么种类的馍，删除什么种类的馍和 Store 无关
 */
public class RouJiaMoStore {
    private SimpleRouJiaMoFactory factory;

    public RouJiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        if (rouJiaMo != null) {
            rouJiaMo.prepare();
            rouJiaMo.fire();
            rouJiaMo.pack();
        }
        return rouJiaMo;
    }
}
