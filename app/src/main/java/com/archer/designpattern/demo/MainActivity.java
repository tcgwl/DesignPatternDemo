package com.archer.designpattern.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.archer.designpattern.demo.decorator.DecoratorActivity;
import com.archer.designpattern.demo.factory.FactoryActivity;
import com.archer.designpattern.demo.observer.ObserverActivity;
import com.archer.designpattern.demo.strategy.StrategyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button strategyBtn = (Button) findViewById(R.id.strategy_btn);
        strategyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StrategyActivity.class);
                startActivity(intent);
            }
        });
        Button observerBtn = (Button) findViewById(R.id.observer_btn);
        observerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObserverActivity.class);
                startActivity(intent);
            }
        });
        Button decoratorBtn = (Button) findViewById(R.id.decorator_btn);
        decoratorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DecoratorActivity.class);
                startActivity(intent);
            }
        });
        Button factoryBtn = (Button) findViewById(R.id.factory_btn);
        factoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
