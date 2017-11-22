package com.archer.designpattern.demo.decorator;

/**
 * 武器
 */

public class ArmEquip implements IEquip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙宝刀";
    }
}
