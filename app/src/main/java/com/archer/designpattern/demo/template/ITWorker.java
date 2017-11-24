package com.archer.designpattern.demo.template;

/**
 * 程序猿
 */

public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "写程序-测bug-Fix bug");
    }

    @Override
    public boolean isNeedPrintDate() {
        return true;
    }
}
