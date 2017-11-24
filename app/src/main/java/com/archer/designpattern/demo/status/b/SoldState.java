package com.archer.designpattern.demo.status.b;

/**
 * 准备出商品的状态
 * 该状态下，不会有任何用户的操作
 */

public class SoldState implements State {
    private VendingMachineB machine;

    public SoldState(VendingMachineB machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("SoldState->正在出货，请勿投币");
    }

    @Override
    public void backMoney() {
        System.out.println("SoldState->正在出货，没有可退的钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("SoldState->正在出货，请勿重复转动手柄");
    }

    @Override
    public void dispense() {
        machine.dispense();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoMoneyState());
        } else {
            System.out.println("SoldState->商品已经售罄");
            machine.setState(machine.getSoldOutState());
        }
    }
}
