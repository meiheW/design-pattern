package com.tomster.design.pattern.decorator;

/**
 * @author meihewang
 * @date 2022/12/22  17:45
 */
public class Decorator implements Beverage {

    Beverage beverage;

    Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description();
    }
}
