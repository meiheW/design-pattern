package com.tomster.design.pattern.decorator;

/**
 * @author meihewang
 * @date 2022/12/22  18:29
 */
public class CoconutDecorator extends Decorator {

    CoconutDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return super.cost() + 2;
    }

    @Override
    public String description() {
        return super.description() + " + coconut $2";
    }
}
