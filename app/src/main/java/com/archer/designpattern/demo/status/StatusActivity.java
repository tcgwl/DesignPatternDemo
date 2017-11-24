package com.archer.designpattern.demo.status;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.archer.designpattern.demo.R;
import com.archer.designpattern.demo.status.a.VendingMachineA;
import com.archer.designpattern.demo.status.b.VendingMachineB;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
    }

    public void clickTestA(View view) {
        testA();
    }

    public void clickTestB(View view) {
        testB();
    }

    private void testB() {
        VendingMachineB machine = new VendingMachineB(10);
        machine.insertMoney();
        machine.backMoney();

        System.out.println("----我要中奖----");

        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();


        System.out.println("-------压力测试------");

        machine.insertMoney();
        machine.backMoney();
        machine.backMoney();
        machine.turnCrank();// 无效操作
        machine.turnCrank();// 无效操作
        machine.backMoney();
    }

    private void testA() {
        VendingMachineA machine = new VendingMachineA(10);
        machine.insertMoney();
        machine.backMoney();

        System.out.println("-----------");

        machine.insertMoney();
        machine.turnCrank();

        System.out.println("----------压力测试-----");
        machine.insertMoney();
        machine.insertMoney();
        machine.turnCrank();
        machine.turnCrank();
        machine.backMoney();
        machine.turnCrank();
    }
}
