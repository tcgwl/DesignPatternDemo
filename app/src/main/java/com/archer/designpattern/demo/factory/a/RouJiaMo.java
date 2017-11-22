package com.archer.designpattern.demo.factory.a;

/**
 * 肉夹馍
 */

public abstract class RouJiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        System.out.println("揉面-剁肉-完成准备工作");
    }

    /**
     * 包装
     */
    public void pack() {
        System.out.println("肉夹馍-专用袋-包装");
    }
    /**
     * 烘烤
     */
    public void fire() {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
