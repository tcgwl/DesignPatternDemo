package com.archer.designpattern.demo.status.b;

/**
 * 没钱的状态
 */

public class NoMoneyState implements State {
    private VendingMachineB machine;

    public NoMoneyState(VendingMachineB machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("NoMoneyState->投币成功");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("NoMoneyState->您未投币，想退钱？...");
    }

    @Override
    public void turnCrank() {
        System.out.println("NoMoneyState->您未投币，想拿东西么？...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
