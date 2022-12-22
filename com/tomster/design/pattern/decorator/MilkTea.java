package com.tomster.design.pattern.decorator;

/**
 * @author meihewang
 * @date 2022/12/22  17:43
 */
public class MilkTea implements Beverage {
    @Override
    public float cost() {
        return 10.0f;
    }

    @Override
    public String description() {
        return "milk tea $10";
    }
}
