package net.yyh.service.impl;

import net.yyh.service.TestService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yyh on 2017/4/19.
 */
public class TestServiceImpl implements TestService {

    public Map<String, Object> getMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","yyh");
        map.put("sex","man");
        return map;
    }
}
