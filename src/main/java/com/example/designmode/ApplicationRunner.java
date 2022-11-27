package com.example.designmode;

import com.example.designmode.singleton.SingletonTestOne;
import com.example.designmode.singleton.SingletonTestTwo;
import com.example.designmode.strategy.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        /*
        单例one的测试
        for(int i =0;i<100;i++){
            SingletonTestOne st = SingletonTestOne.getInstance();
            log.info(String.valueOf(st.hashCode()));
            st.testSingleton();
        }
        */
        /*
        单例two的测试
        for(int i =0;i<100;i++){
            SingletonTestTwo st = SingletonTestTwo.INSTANCE;
            log.info(String.valueOf(st.hashCode()));
            st.testSingleton();
        }
         */
        /*
        最简单的策略模式
        Strategy st = new OptionOne();
        st.doOption();
         */

//        Cat[] cat = {new Cat(1),new Cat(12),new Cat(5)};
//        SortStrategy.sort(cat);
//        for(Cat catSort : cat){
//            log.info(catSort.toString());
//        }
        Cat[] cat = {new Cat(1),new Cat(12),new Cat(5)};
        SortStrategy<Cat> st = new SortStrategy<>();
        st.sort(cat, (t1,t2) -> t1.weight<t2.weight);
        for(Cat catSort : cat){
            log.info(catSort.toString());
        }
    }
}
