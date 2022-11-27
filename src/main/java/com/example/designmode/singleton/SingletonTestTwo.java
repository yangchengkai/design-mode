package com.example.designmode.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 枚举类型单例
 */
@Slf4j
public enum SingletonTestTwo {

    INSTANCE;

    public void testSingleton(){
        log.info("Singleton 测试");
    }

}
