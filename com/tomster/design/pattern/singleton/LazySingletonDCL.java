package com.tomster.design.pattern.singleton;

/**
 * @author meihewang
 * @date 2022/11/03  14:49
 */
public class LazySingletonDCL {

    //防止指令重排序导致获取到没有初始化的对象（如果创建过程时间很长）
    private static volatile LazySingletonDCL instance = null;

    private LazySingletonDCL() {
    }

    /**
     * 双检锁/双重校验锁
     * 为什么双重校验，即两个if判空
     * 为什么加双锁，即synchronized和volatile
     */
    public static LazySingletonDCL getInstance2() {
        //完成实例化后，不需要进入同步代码块直接返回对象
        if (instance == null) {
            synchronized (LazySingletonDCL.class) {
                //防止多次实例化，初次加载时可能会有其他线程阻塞在同步代码块
                if (instance == null) {
                    //在堆中开辟对象所需空间，分配地址
                    //根据类加载的初始化顺序进行初始化
                    //将内存地址返回给栈中的引用变量
                    instance = new LazySingletonDCL();
                }
            }
        }
        return instance;
    }

}
