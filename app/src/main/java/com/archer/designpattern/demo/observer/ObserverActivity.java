package com.archer.designpattern.demo.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.archer.designpattern.demo.R;
import com.archer.designpattern.demo.observer.api.Observer1WithApi;
import com.archer.designpattern.demo.observer.api.SubjectFor3DWithApi;
import com.archer.designpattern.demo.observer.api.SubjectForSSQWithApi;
import com.archer.designpattern.demo.observer.diy.Observer1;
import com.archer.designpattern.demo.observer.diy.Observer2;
import com.archer.designpattern.demo.observer.diy.SubjectFor3D;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        Log.d("Observer", "自己实现观察者模式");
        SubjectFor3D subjectFor3D = new SubjectFor3D();
        Observer1 observer1 = new Observer1(subjectFor3D);
        Observer2 observer2 = new Observer2(subjectFor3D);
        subjectFor3D.setMsg("20160520的3D号码是：168");
        subjectFor3D.setMsg("20160521的3D号码是：856");

        Log.d("Observer", "------------------------");

        Log.d("Observer", "使用Java内置的类实现观察者模式");
        SubjectFor3DWithApi subjectFor3DWithApi = new SubjectFor3DWithApi();
        SubjectForSSQWithApi subjectForSSQWithApi = new SubjectForSSQWithApi();
        Observer1WithApi observer1WithApi = new Observer1WithApi();
        observer1WithApi.registerSubject(subjectFor3DWithApi);
        observer1WithApi.registerSubject(subjectForSSQWithApi);
        subjectFor3DWithApi.setMsg("20160520的3D号码是：168");
        subjectForSSQWithApi.setMsg("20160520的双色球号码是：05,10,20,23,26,31+03");
    }
}
