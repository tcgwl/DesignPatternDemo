package com.archer.designpattern.demo.command;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.archer.designpattern.demo.R;

public class CommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        //三个家电
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();
        //一个控制器，假设是我们的app主界面
        ControlPanel controlPanel = new ControlPanel();
        //为每个按钮设置功能
        controlPanel.setCommand(0, new LightOnCommond(light));
        controlPanel.setCommand(1, new LightOffCommond(light));
        controlPanel.setCommand(2, new ComputerOnCommond(computer));
        controlPanel.setCommand(3, new ComputerOffCommond(computer));
        controlPanel.setCommand(4, new DoorOpenCommond(door));
        controlPanel.setCommand(5, new DoorCloseCommond(door));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳

        //定义一个按钮可以直接关门、开灯、开电脑
        QuickCommand quickCommand = new QuickCommand(new Command[] {
                    new DoorCloseCommond(door), new LightOnCommond(light), new ComputerOnCommond(computer)
                });
        controlPanel.setCommand(8, quickCommand);
        System.out.println("****点击一键搞定按钮****");
        controlPanel.keyPressed(8);
    }
}
