package com.archer.designpattern.demo.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.archer.designpattern.demo.R;
import com.archer.designpattern.demo.factory.b.RouJiaMo;
import com.archer.designpattern.demo.factory.b.XianRouJiaMoStore;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        XianRouJiaMoStore xianRouJiaMoStore = new XianRouJiaMoStore();
        RouJiaMo rouJiaMo = xianRouJiaMoStore.sellRouJiaMo("Suan");
        Log.d("Factory", rouJiaMo.getName());
    }
}
