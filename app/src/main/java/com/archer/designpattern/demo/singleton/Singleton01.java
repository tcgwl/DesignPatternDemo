package com.archer.designpattern.demo.singleton;

/**
 * 饿汉式
 * 类加载就初始化了
 */

public class Singleton01 {
    private static Singleton01 instance = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return instance;
    }
}
