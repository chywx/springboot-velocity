package cn.chendahai.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述
 *
 * @author chy
 * @date 2020/3/19 0019
 */
@Controller
@RequestMapping("/velocity")
public class TestController {

    @RequestMapping("/demo1")
    public String demo1(Map map) {
        map.put("message", "这是测试的内容。。。");
        map.put("toUserName", "张三1");
        map.put("fromUserName", "老许");
        map.put("time", System.currentTimeMillis());
        return "index";
    }

    @RequestMapping("/demo2")
    public String demo2(Map map) {
        map.put("message", "这是测试的内容。。。");
        map.put("toUserName", "张三1");
        map.put("fromUserName", "老许");
        map.put("time", System.currentTimeMillis());
        int i = 1 / 0;
        return "index";
    }

    @RequestMapping("/demo3")
    public String demo3(Map map) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        map.put("strings", strings);
        return "index3";
    }

}
