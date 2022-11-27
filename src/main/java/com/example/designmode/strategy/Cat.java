package com.example.designmode.strategy;

public class Cat implements Comparable<Cat>{
    public int weight;
    public Cat(int weight){
        this.weight=weight;
    }
    @Override
    public int compareTo(Cat o) {
        // 该类的排序
        return this.weight-o.weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
