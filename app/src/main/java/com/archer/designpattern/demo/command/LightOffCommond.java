package com.archer.designpattern.demo.command;

/**
 * 关闭电灯的命令
 */

public class LightOffCommond implements Command {
    private Light light ;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
