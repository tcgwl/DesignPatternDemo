package com.archer.designpattern.demo.template;

/**
 * 项目经理
 */

public class ManagerWorker extends Worker {
    public ManagerWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "玩炒股...");
    }
}
