package com.baoguoding.logback.debug;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DebugController {

    Logger logger = LoggerFactory.getLogger(DebugController.class);

    @RequestMapping("/debug")
    public String index() {

        // 输出字符串
        logger.debug("This is a debug msg");

        return "debug";
    }

}