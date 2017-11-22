package com.archer.designpattern.demo.observer.diy;

/**
 * 主题接口，所有的主题必须实现此接口
 */

public interface Subject {
    /**
     * 注册一个观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    void unregisterObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
