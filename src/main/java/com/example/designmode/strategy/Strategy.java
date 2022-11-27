package com.example.designmode.strategy;

/**
 * 策略接口
 * 该接口主要是用来分配策略的
 *
 * 比如该类只有一个doOption方法，用来分配多种实现Strategy的独立的操作方法
 */
public interface Strategy {

    int doOption();
}
