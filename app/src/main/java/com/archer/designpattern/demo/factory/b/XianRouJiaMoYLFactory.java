package com.archer.designpattern.demo.factory.b;

/**
 * 根据西安当地特色，提供原料
 */

public class XianRouJiaMoYLFactory implements RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {
        return new FreshMeat();
    }

    @Override
    public TiaoLiao createTiaoLiao() {
        return new XianTeSeTiaoLiao();
    }
}
