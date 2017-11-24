package com.archer.designpattern.demo.command;

/**
 * 关闭门的命令
 */

public class DoorCloseCommond implements Command {
    private Door door ;

    public DoorCloseCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
