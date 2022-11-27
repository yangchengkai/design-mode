package com.example.designmode.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionTwo implements Strategy{

    @Override
    public int doOption() {
        log.info("OptionTwo");
        return 2;
    }
}
