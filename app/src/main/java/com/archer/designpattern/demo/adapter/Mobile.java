package com.archer.designpattern.demo.adapter;

/**
 * Created by Archer on 2017/11/24.
 */

public class Mobile {
    /**
     * 充电
     */
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}
