package com.tomster.design.pattern.singleton;

/**
 * @author meihewang
 * @date 2022/11/03  14:49
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 静态方法上加锁，是加的类锁，相当于LazySingleton.class
     * 普通方法上加的是对象锁
     * 加锁能保证线程安全，但是会影响效率
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
