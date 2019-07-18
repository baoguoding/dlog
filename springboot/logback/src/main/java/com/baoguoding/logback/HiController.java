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
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "slf4j logback demo!";
    }

}