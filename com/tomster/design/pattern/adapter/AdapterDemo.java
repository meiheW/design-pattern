package com.tomster.design.pattern.adapter;

/**
 * @author meihewang
 * @date 2022/12/22  19:05
 */
public class AdapterDemo {

    public static void main(String[] args) {
        //适配器包装对象，并调用包装对象的方法
        //适配器实现目标接口，包含被适配的接口
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
