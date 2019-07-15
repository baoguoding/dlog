package com.baoguoding.logback.error;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping("/err")
    public String index() {

        // 输出字符串
        logger.error("this is a error msg");

        return "err";
    }

}