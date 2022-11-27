package com.example.designmode.strategy;

@FunctionalInterface
public interface Comparetor<T>{

    boolean sort(T t1,T t2);
}
