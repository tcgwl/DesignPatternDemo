package com.archer.designpattern.demo.factory.b;

import android.util.Log;

/**
 * 肉夹馍
 */

public abstract class RouJiaMo {
    private static final String TAG = "Factory";
    protected String name;

    /**
     * 准备工作
     */
    public final void prepare(RouJiaMoYLFactory ylFactroy) {
        Meat meat = ylFactroy.createMeat();
        TiaoLiao tiaoLiao = ylFactroy.createTiaoLiao();
        Log.d(TAG, "使用官方的原料 " + meat + ", " + tiaoLiao + " 作为原材料制作肉夹馍~");
    }

    /**
     * 包装
     */
    public final void pack() {
        Log.d(TAG, "肉夹馍-专用袋-包装");
    }

    /**
     * 烘烤
     */
    public final void fire() {
        Log.d(TAG, "肉夹馍-专用设备-烘烤");
    }

    public String getName() {
        return name;
    }
}
