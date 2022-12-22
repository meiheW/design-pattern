package com.tomster.design.pattern.decorator;

/**
 * @author meihewang
 * @date 2022/12/22  18:24
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        PearlDecorator pearlMilkTea = new PearlDecorator(new MilkTea());
        System.out.println(pearlMilkTea.cost());
        System.out.println(pearlMilkTea.description());

        CoconutDecorator coconutDecorator = new CoconutDecorator(new MilkTea());
        System.out.println(coconutDecorator.cost());
        System.out.println(coconutDecorator.description());

        //装饰者区别于其他的方法增强的地方
        //装饰者和实际具体的类实现了同样的接口，具体实现类和装饰者以组合的形式结合
        //装饰者可以以嵌套的形式增强方法。
        CoconutDecorator pearlCoconutMilkTea = new CoconutDecorator(pearlMilkTea);
        System.out.println(pearlCoconutMilkTea.cost());
        System.out.println(pearlCoconutMilkTea.description());


    }

}
