package com.archer.designpattern.demo.factory.b;

/**
 * 肉夹馍
 */

public abstract class RouJiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public final void prepare(RouJiaMoYLFactory ylFactroy) {
        Meat meat = ylFactroy.createMeat();
        TiaoLiao yuanliao = ylFactroy.createTiaoLiao();
        System.out.println("使用官方的原料 " + meat + ", " + yuanliao + " 作为原材料制作肉夹馍~");
    }

    /**
     * 包装
     */
    public final void pack() {
        System.out.println("肉夹馍-专用袋-包装");
    }

    /**
     * 烘烤
     */
    public final void fire() {
        System.out.println("肉夹馍-专用设备-烘烤");
    }

    public String getName() {
        return name;
    }
}
