package com.toto.bet730.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2Controller
{

    private static final Logger log = org.apache.logging.log4j.LogManager.getLogger(Log4j2Controller.class);

    @GetMapping(value = "/log")
    public void log() throws Exception
    {
        //log4j2 테스트 및 로깅순위 확인
        //FATAL, ERROR, WARN, INFO, DEBUG, TRACE
//        log.fatal("FATAL");
//        log.error("ERROR");
//        log.warn("WARN");
//        log.info("INFO");
//        log.debug("DEBUG");
//        log.trace("TRACE");
//        log.debug("테스트");
        log.info("테스트");
    }

}
