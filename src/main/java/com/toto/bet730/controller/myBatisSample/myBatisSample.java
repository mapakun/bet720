package com.toto.bet730.controller.myBatisSample;

import com.toto.bet730.controller.Log4j2Controller;
import com.toto.bet730.model.sample.sampleMyBatisMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class myBatisSample
{
    private static final Logger log = org.apache.logging.log4j.LogManager.getLogger(Log4j2Controller.class);
    @Autowired
    private sampleMyBatisMapper samplemyBatisMapper;

    @GetMapping("/sample")
    public void MyBatisSample() throws Exception
    {
        List<Map<String,Object>> test = samplemyBatisMapper.mapperTest();
        log.info(test);
    }
}
