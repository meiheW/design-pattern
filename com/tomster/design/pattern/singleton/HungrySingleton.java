package com.tomster.design.pattern.singleton;

/**
 * @author meihewang
 * @date 2022/11/03  14:47
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }


}
