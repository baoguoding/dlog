package com.baoguoding.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    Logger logger = LoggerFactory.getLogger(HiController.class);

    @RequestMapping("/")
    public String index() {
        // 占位符
        logger.debug("hi, welcome {}, today is {}","admin","Sunday");
        return "slf4j logback demo!";
    }

}