package com.baoguoding.logback.trace;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceController {

    Logger logger = LoggerFactory.getLogger(TraceController.class);

    @RequestMapping("/trace")
    public String index() {

        // 输出字符串
        logger.trace("this is a trace msg");

        return "trace";
    }

}