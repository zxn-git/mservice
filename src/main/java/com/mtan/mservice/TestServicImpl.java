package com.mtan.mservice;

import com.mtan.interf.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestServicImpl implements TestService {

    Logger logger = LoggerFactory.getLogger(TestServicImpl.class);


    @Override
    public Long test(Long time) {
        String name = Thread.currentThread().getName();
        long l = System.currentTimeMillis();
        logger.info("线程id:{},消息传输时间:{}", name, l - time);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis();
    }

    @Override
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
