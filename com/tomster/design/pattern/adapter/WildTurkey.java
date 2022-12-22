package com.tomster.design.pattern.adapter;

/**
 * @author meihewang
 * @date 2022/12/22  19:02
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
