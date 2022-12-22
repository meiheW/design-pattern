package com.tomster.design.pattern.adapter;

/**
 * @author meihewang
 * @date 2022/12/22  19:03
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
