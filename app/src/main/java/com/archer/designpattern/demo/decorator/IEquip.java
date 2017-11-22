package com.archer.designpattern.demo.decorator;

/**
 * 装备的接口
 */

public interface IEquip {
    /**
     * 计算攻击力
     */
    int caculateAttack();

    /**
     * 装备的描述
     */
    String description();
}
