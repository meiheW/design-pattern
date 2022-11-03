package com.tomster.design.pattern.singleton;

/**
 * @author meihewang
 * @date 2022/11/03  14:48
 */
public class SingletonDemo {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("hello world");
    }

}
