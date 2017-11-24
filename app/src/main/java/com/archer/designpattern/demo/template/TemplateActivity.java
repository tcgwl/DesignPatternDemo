package com.archer.designpattern.demo.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.archer.designpattern.demo.R;

public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        Worker it1 = new ITWorker("小吴");
        it1.workOneDay();
        Worker it2 = new ITWorker("小武");
        it2.workOneDay();
        Worker hr = new HRWorker("老樊");
        hr.workOneDay();
        Worker qa = new QAWorker("阿桑");
        qa.workOneDay();
        Worker pm = new ManagerWorker("老胡");
        pm.workOneDay();
    }
}
