package com.xywei.log;

import com.xywei.code.wechatsell.WechatSellApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author future
 * @DateTime 2019/10/29 18:18
 **/
@SpringBootTest(classes = {WechatSellApplication.class})
public class TestLogback {

    private static final Logger log = LoggerFactory.getLogger(TestLogback.class);

    /**
     * @Description
     * @Author future
     * @DateTime 2019/10/29 18:28
     **/
    @Test
    public void testLog1() {
        try {

//            Object obj = null;
//            obj.toString();
            throw new Exception("自定义");

        } catch (Exception e) {
//            e.printStackTrace();
            log.error(e.toString());
        }
        log.info("info log");
        log.warn("warn log");
        log.debug("debug log");
        log.error("error log");
    }

    /**
     * @Description
     * @Author future
     * @DateTime 2019/10/29 18:28
     **/
    public void test2() {

    }
}
