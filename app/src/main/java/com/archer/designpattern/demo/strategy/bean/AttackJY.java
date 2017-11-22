package com.archer.designpattern.demo.strategy.bean;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class AttackJY implements IAttackBehavior {
    @Override
    public String attack() {
        Log.d("Strategy", "attack: 九阳神功");
        return "九阳神功";
    }
}
