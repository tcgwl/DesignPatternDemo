package com.archer.designpattern.demo.command;

/**
 * 关闭电脑的命令
 */

public class ComputerOffCommond implements Command {
    private Computer computer ;

    public ComputerOffCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
