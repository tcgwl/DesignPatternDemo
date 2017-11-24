package com.archer.designpattern.demo.status.b;

/**
 * 中奖的状态
 * 该状态下不会有任何用户的操作
 */

public class WinnerState implements State {
    private VendingMachineB machine;

    public WinnerState(VendingMachineB machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void dispense() {
        System.out.println("WinnerState->你中奖了，恭喜你，将得到2件商品");
        machine.dispense();

        if (machine.getCount() == 0) {
            System.out.println("WinnerState->商品已经售罄");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.dispense();
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoMoneyState());
            } else {
                System.out.println("WinnerState->商品已经售罄");
                machine.setState(machine.getSoldOutState());
            }
        }
    }
}
