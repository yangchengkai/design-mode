package com.example.designmode.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 饿汉式单例模式，使用频次较高，不需要考虑线程安全问题
 * 在现阶段的内存容量较大的情况下，提前加载比较方便
 */
@Slf4j
public class SingletonTestOne {

    private static final SingletonTestOne INSTANCE  = new SingletonTestOne();

    private SingletonTestOne(){};

    public static SingletonTestOne getInstance(){
        return INSTANCE;
    }

    public void testSingleton(){
        log.info("Singleton 测试");
    }
}
