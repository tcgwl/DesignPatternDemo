package com.archer.designpattern.demo.strategy.bean;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class DefendTBS implements IDefendBehavior {
    @Override
    public String defend() {
        Log.d("Strategy", "defend: 铁布衫");
        return "铁布衫";
    }
}
