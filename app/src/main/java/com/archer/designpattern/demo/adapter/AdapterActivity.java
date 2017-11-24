package com.archer.designpattern.demo.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.archer.designpattern.demo.R;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
