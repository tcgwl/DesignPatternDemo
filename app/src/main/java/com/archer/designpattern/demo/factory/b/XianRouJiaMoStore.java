package com.archer.designpattern.demo.factory.b;

/**
 * 西安肉夹馍店
 */

public class XianRouJiaMoStore extends RouJiaMoStore {
    /**
     * 由子类决定实例化的类
     */
    @Override
    protected RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")) {
            rouJiaMo = new XianSuanRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new XianTianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new XianLaRouJiaMo();
        }
        return rouJiaMo;
    }

    /**
     * 必须用我们官方原料做为原材料
     */
    @Override
    protected RouJiaMoYLFactory createRouJiaMoYLFactory() {
        return new XianRouJiaMoYLFactory();
    }
}
