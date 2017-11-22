package com.archer.designpattern.demo.observer.diy;

/**
 * 所有的观察者需要实现此接口
 */

public interface Observer {
    void update(String msg);
}
