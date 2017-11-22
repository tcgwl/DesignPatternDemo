package com.archer.designpattern.demo.observer.diy;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.d("Observer", "observer1 得到3D号码-->" + msg);
    }
}
