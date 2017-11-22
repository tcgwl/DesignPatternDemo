package com.archer.designpattern.demo.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.archer.designpattern.demo.R;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);

        // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
        Log.d("decorator", "一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
        IEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        Log.d("decorator", "攻击力: " + equip.caculateAttack());
        Log.d("decorator", "描述: " + equip.description());

        Log.d("decorator", "---------------------------");

        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        Log.d("decorator", "一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
        equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
        Log.d("decorator", "攻击力: " + equip.caculateAttack());
        Log.d("decorator", "描述: " + equip.description());
    }
}
