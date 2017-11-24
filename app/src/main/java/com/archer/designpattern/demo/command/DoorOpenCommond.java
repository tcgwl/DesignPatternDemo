package com.archer.designpattern.demo.command;

/**
 * 打开门的命令
 */

public class DoorOpenCommond implements Command {
    private Door door ;

    public DoorOpenCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
