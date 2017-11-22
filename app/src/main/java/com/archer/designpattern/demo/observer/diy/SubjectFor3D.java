package com.archer.designpattern.demo.observer.diy;

import java.util.ArrayList;
import java.util.List;

/**
 * 3D服务号的实现类
 * 服务号中维护了所有向它订阅消息的使用者，当服务号有新消息时，通知所有的使用者。
 * 整个架构是一种松耦合，主题的实现不依赖与使用者，
 * 当增加新的使用者时，主题的代码不需要改变；
 * 使用者如何处理得到的数据与主题无关
 */

public class SubjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();
    /**
     * 3D彩票的号码
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if (observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
