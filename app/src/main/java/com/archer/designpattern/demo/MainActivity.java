package com.archer.designpattern.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.archer.designpattern.demo.adapter.AdapterActivity;
import com.archer.designpattern.demo.command.CommandActivity;
import com.archer.designpattern.demo.decorator.DecoratorActivity;
import com.archer.designpattern.demo.facade.FacadeActivity;
import com.archer.designpattern.demo.factory.FactoryActivity;
import com.archer.designpattern.demo.observer.ObserverActivity;
import com.archer.designpattern.demo.singleton.SingletonActivity;
import com.archer.designpattern.demo.status.StatusActivity;
import com.archer.designpattern.demo.strategy.StrategyActivity;
import com.archer.designpattern.demo.template.TemplateActivity;

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
        Button singltonBtn = (Button) findViewById(R.id.singlton_btn);
        singltonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SingletonActivity.class);
                startActivity(intent);
            }
        });
        Button commandBtn = (Button) findViewById(R.id.command_btn);
        commandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CommandActivity.class);
                startActivity(intent);
            }
        });
        Button adapterBtn = (Button) findViewById(R.id.adapter_btn);
        adapterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdapterActivity.class);
                startActivity(intent);
            }
        });
        Button facadeBtn = (Button) findViewById(R.id.facade_btn);
        facadeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FacadeActivity.class);
                startActivity(intent);
            }
        });
        Button templateBtn = (Button) findViewById(R.id.template_btn);
        templateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TemplateActivity.class);
                startActivity(intent);
            }
        });
        Button statusBtn = (Button) findViewById(R.id.status_btn);
        statusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StatusActivity.class);
                startActivity(intent);
            }
        });
    }
}
