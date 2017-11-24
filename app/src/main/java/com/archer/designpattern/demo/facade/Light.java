package com.archer.designpattern.demo.facade;

/**
 * 灯
 */

public class Light {
    public void down() {
        System.out.println("将灯光调暗");
    }

    public void up() {
        System.out.println("将灯光调亮");
    }
}
