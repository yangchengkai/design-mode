package com.example.designmode.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 操作1
 */
@Slf4j
public class OptionOne implements Strategy{
    @Override
    public int doOption() {
        log.info("OptionOne");
        return 1;
    }
}
