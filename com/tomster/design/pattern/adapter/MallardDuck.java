package com.tomster.design.pattern.adapter;

/**
 * @author meihewang
 * @date 2022/12/22  19:01
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
