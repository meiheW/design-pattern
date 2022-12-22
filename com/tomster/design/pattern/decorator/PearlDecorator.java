package com.tomster.design.pattern.decorator;

/**
 * @author meihewang
 * @date 2022/12/22  17:59
 */
public class PearlDecorator extends Decorator {

    PearlDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String description() {
        return super.description() + " + pearl $1";
    }
}
