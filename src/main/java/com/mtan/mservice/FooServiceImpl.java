package com.mtan.mservice;

import com.mtan.interf.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooServiceImpl implements FooService {
    Logger logger = LoggerFactory.getLogger(FooServiceImpl.class);


    public String hello(String name) {
        String nameThread = Thread.currentThread().getName();

        logger.info("线程" + nameThread);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "hello " + name;
    }
}