package com.archer.designpattern.demo.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.archer.designpattern.demo.R;
import com.archer.designpattern.demo.strategy.bean.AttackJY;
import com.archer.designpattern.demo.strategy.bean.DefendTBS;
import com.archer.designpattern.demo.strategy.bean.DisplayA;
import com.archer.designpattern.demo.strategy.bean.RoleA;
import com.archer.designpattern.demo.strategy.bean.RunLBWB;

public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);

        RoleA roleA = new RoleA("Archer");
        roleA.setDisplayBehavior(new DisplayA())
                .setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setRunBehavior(new RunLBWB());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name: " + roleA.getName() + "\n");
        stringBuilder.append("display: " + roleA.display() + "\n");
        stringBuilder.append("attack: " + roleA.attack() + "\n");
        stringBuilder.append("defend: " + roleA.defend() + "\n");
        stringBuilder.append("run: " + roleA.run() + "\n");

        TextView contentTv = (TextView) findViewById(R.id.strategy_content);
        contentTv.setText(stringBuilder.toString());
    }
}
