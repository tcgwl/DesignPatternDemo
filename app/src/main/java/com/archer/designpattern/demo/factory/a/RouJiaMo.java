package com.archer.designpattern.demo.factory.a;

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
    public void prepare() {
        Log.d(TAG, "揉面-剁肉-完成准备工作");
    }

    /**
     * 包装
     */
    public void pack() {
        Log.d(TAG, "肉夹馍-专用袋-包装");
    }
    /**
     * 烘烤
     */
    public void fire() {
        Log.d(TAG, "肉夹馍-专用设备-烘烤");
    }
}
