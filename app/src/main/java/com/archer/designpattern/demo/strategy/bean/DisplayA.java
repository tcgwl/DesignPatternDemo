package com.archer.designpattern.demo.strategy.bean;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class DisplayA implements IDisplayBehavior {
    @Override
    public String display() {
        Log.d("Strategy", "display: 样子1");
        return "样子1";
    }
}
