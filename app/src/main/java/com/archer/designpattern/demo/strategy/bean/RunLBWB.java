package com.archer.designpattern.demo.strategy.bean;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class RunLBWB implements IRunBehavior {
    @Override
    public String run() {
        Log.d("Strategy", "run: 凌波微步");
        return "凌波微步";
    }
}
