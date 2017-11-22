package com.archer.designpattern.demo.factory.b;

/**
 * 抽象工厂模式
 * 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
 *
 * 提供肉夹馍的原料
 */

public interface RouJiaMoYLFactory {
    /**
     * 生产肉
     */
    Meat createMeat();
    /**
     * 生产调料
     */
    TiaoLiao createTiaoLiao();
}
