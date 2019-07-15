package com.baoguoding.logback.warn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarnController {

    Logger logger = LoggerFactory.getLogger(WarnController.class);

    @RequestMapping("/warn")
    public String index() {

        // 输出字符串
        logger.warn("this is a warn msg");

        return "warn";
    }

}