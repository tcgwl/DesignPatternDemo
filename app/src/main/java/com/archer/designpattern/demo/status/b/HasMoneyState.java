package com.archer.designpattern.demo.status.b;

import java.util.Random;

/**
 * 已投入钱的状态
 */

public class HasMoneyState implements State {
    private VendingMachineB machine;
    private Random random = new Random();

    public HasMoneyState(VendingMachineB machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("HasMoneyState->您已经投过币了，无需再投....");
    }

    @Override
    public void backMoney() {
        System.out.println("HasMoneyState->退币成功");
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("HasMoneyState->你转动了手柄");
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
