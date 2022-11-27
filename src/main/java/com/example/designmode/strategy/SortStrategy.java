package com.example.designmode.strategy;

import java.util.function.Predicate;

/**
 * SortStrategy是个策略器，也可以理解为是工具类，只要想排序，就将类实现Comparable接口
 * 实现compareTo方法,那么该sort方法，就是按照conpareTo方法对其进行排序
 */
public class SortStrategy<T> {

//    public static void sort(Comparable[] comparable){
//        for (int i = 0; i < comparable.length; i++) {
//            for (int j = 0; j < comparable.length -  i - 1; j++) {
//                if (comparable[j].compareTo(comparable[j + 1])>0) {
//                    Comparable temp;
//                    temp = comparable[j + 1];
//                    comparable[j + 1] = comparable[j];
//                    comparable[j] = temp;
//                }
//            }
//        }
//    }

    public void sort(T[] t, Comparetor<T> comparetor){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length -  i - 1; j++) {
                if (comparetor.sort(t[j],t[j + 1])) {
                    T temp;
                    temp = t[j + 1];
                    t[j + 1] = t[j];
                    t[j] = temp;
                }
            }
        }
    }
}
