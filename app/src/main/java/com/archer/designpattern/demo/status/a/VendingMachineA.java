package com.archer.designpattern.demo.status.a;

/**
 * 自动售货机
 * 4个状态：未投币、已投币、售出商品、商品售罄
 * 3个暴露在外的方法：投币、退币、转动手柄
 * 在每个状态下，用户都可以触发这三个动作
 */

public class VendingMachineA {
    /**
     * 未投币
     */
    private final static int NO_MONEY = 0;
    /**
     * 已投币
     */
    private final static int HAS_MONEY = 1;
    /**
     * 售出商品
     */
    private final static int SOLD = 2;
    /**
     * 商品售罄
     */
    private final static int SOLD_OUT = 3;

    private int currentStatus = NO_MONEY;
    /**
     * 商品数量
     */
    private int count = 0;

    public VendingMachineA(int count) {
        this.count = count;
        if (count > 0) {
            currentStatus = NO_MONEY;
        }
    }

    /**
     * 投入硬币，任何状态用户都可能投币
     */
    public void insertMoney() {
        switch (currentStatus) {
            case NO_MONEY:
                currentStatus = HAS_MONEY;
                System.out.println("insertMoney->成功投入硬币");
                break;
            case HAS_MONEY:
                System.out.println("insertMoney->已经有硬币，无需投币");
                break;
            case SOLD:
                System.out.println("insertMoney->请稍等...");
                break;
            case SOLD_OUT:
                System.out.println("insertMoney->商品已经售罄，请勿投币");
                break;
        }
    }

    /**
     * 退币，任何状态用户都可能退币
     */
    public void backMoney() {
        switch (currentStatus) {
            case NO_MONEY:
                System.out.println("backMoney->您未投币...");
                break;
            case HAS_MONEY:
                currentStatus = NO_MONEY;
                System.out.println("backMoney->退币成功");
                break;
            case SOLD:
                System.out.println("backMoney->您已经买了饮料...");
                break;
            case SOLD_OUT:
                System.out.println("backMoney->您未投币...");
                break;
        }
    }

    /**
     * 转动手柄购买,任何状态用户都可能转动手柄
     */
    public void turnCrank() {
        switch (currentStatus) {
            case NO_MONEY:
                System.out.println("turnCrank->请先投币");
                break;
            case HAS_MONEY:
                System.out.println("turnCrank->正在出商品....");
                currentStatus = SOLD;
                dispense();
                break;
            case SOLD:
                System.out.println("turnCrank->连续转动也没用...");
                break;
            case SOLD_OUT:
                System.out.println("turnCrank->商品已经售罄");
                break;
        }
    }

    /**
     * 发放商品
     */
    private void dispense() {
        switch (currentStatus) {
            case NO_MONEY:
            case HAS_MONEY:
            case SOLD_OUT:
               throw new IllegalStateException("dispense->非法的状态...");
            case SOLD:
                count--;
                System.out.println("dispense->发出商品...");
                if (count == 0) {
                    System.out.println("dispense->商品售罄");
                    currentStatus = SOLD_OUT;
                } else {
                    currentStatus = NO_MONEY;
                }
                break;
        }
    }
}
