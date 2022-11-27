package com.toto.bet730.model.sample;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface sampleMyBatisMapper
{
    List<Map<String,Object>> mapperTest();
}
