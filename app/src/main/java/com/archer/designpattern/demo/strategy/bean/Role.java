package com.archer.designpattern.demo.strategy.bean;

import android.util.Log;

/**
 * Created by Archer on 2017/11/22.
 */

public abstract class Role {
    protected String name;
    protected IDisplayBehavior displayBehavior;
    protected IAttackBehavior attackBehavior;
    protected IDefendBehavior defendBehavior;
    protected IRunBehavior runBehavior;

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public String display() {
        return displayBehavior.display();
    }

    public String attack() {
        return attackBehavior.attack();
    }

    public String defend() {
        return defendBehavior.defend();
    }

    public String run() {
        return runBehavior.run();
    }

    public String getName() {
        Log.d("Strategy", "name: " + name);
        return name;
    }
}
