package com.baoguoding.logback.info;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    Logger logger = LoggerFactory.getLogger(InfoController.class);

    @RequestMapping("/info")
    public String index() {

        // 输出字符串
        logger.info("this is a info msg");

        return "info";
    }

}