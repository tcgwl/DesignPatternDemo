package com.archer.designpattern.demo.observer.diy;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public class Observer2 implements Observer {
    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.d("Observer", "observer2 得到3D号码-->" + msg);
    }
}
