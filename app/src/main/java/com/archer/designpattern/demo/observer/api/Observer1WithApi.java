package com.archer.designpattern.demo.observer.api;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Archer on 2017/11/22.
 */

public class Observer1WithApi implements Observer {
    public Observer1WithApi() {
    }
    public Observer1WithApi(Observable observable) {
        registerSubject(observable);
    }

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof SubjectFor3DWithApi) {
            SubjectFor3DWithApi subjectFor3DWithApi = (SubjectFor3DWithApi) observable;
            Log.d("Observer", "observer1 得到消息-->" + subjectFor3DWithApi.getMsg());
        }
        if (observable instanceof SubjectForSSQWithApi) {
            SubjectForSSQWithApi subjectForSSQWithApi = (SubjectForSSQWithApi) observable;
            Log.d("Observer", "observer1 得到消息-->" + subjectForSSQWithApi.getMsg());
        }
    }
}
