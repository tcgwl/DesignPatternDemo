package com.archer.designpattern.demo.status.b;

/**
 * 自动售货机
 * 4个状态：未投币、已投币、售出商品、商品售罄、中奖
 * 3个暴露在外的方法：投币、退币、转动手柄
 * 在每个状态下，用户都可以触发这三个动作
 */

public class VendingMachineB implements State {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;
    private State winnerState ;

    private int count;
    private State currentState = noMoneyState;

    public VendingMachineB(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    /**
     * 投入硬币，任何状态用户都可能投币
     */
    @Override
    public void insertMoney() {
        currentState.insertMoney();
    }

    /**
     * 退币，任何状态用户都可能退币
     */
    @Override
    public void backMoney() {
        currentState.backMoney();
    }

    /**
     * 转动手柄购买,任何状态用户都可能转动手柄
     */
    @Override
    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState)
            currentState.dispense();
    }

    @Override
    public void dispense() {
        if (count != 0) {
            System.out.println("VendingMachineB->发出一件商品...");
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
