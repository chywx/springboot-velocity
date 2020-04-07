package cn.chendahai.controller;

import cn.chendahai.entity.Sport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * velocity
 *
 * @author chy
 * @date 2020/3/19 0019
 */
@Controller
@RequestMapping("/velocity")
public class TestController {

    // demo测试
    @RequestMapping("/demo")
    public String demo1(Map map) {
        map.put("message", "这是测试的内容。。。");
        map.put("time", System.currentTimeMillis());
        return "index";
    }

    // 出异常走全局异常处理，跳转到error页面
    @RequestMapping("/testError")
    public String demo2(Map map) {
        map.put("message", "这是测试的内容。。。");
        // 故意报错
        int i = 1 / 0;
        return "index";
    }


    // velocity常用语法汇总
    @RequestMapping("/allDemo")
    public String demo3(Map map) {
        map.put("amount", 100);
        map.put("msg", "dahai");
        map.put("sex", "man");
        putString(map);
        putSportList(map);
        map.put("time", System.currentTimeMillis());
        return "allDemo";
    }

    private void putSportList(Map map) {
        List<Sport> sportList = new ArrayList<Sport>() {{
            add(new Sport(1, "Football"));
            add(new Sport(2, "Basketball"));
            add(new Sport(3, "tennis"));
            add(new Sport(4, "rugby"));
            add(new Sport(5, "cricket"));
        }};
        map.put("sportList", sportList);
        Map<Integer, Sport> sportMap = sportList.stream().collect(Collectors.toMap(Sport::getId, s -> s));
        map.put("sportMap", sportMap);
    }

    private void putString(Map map) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        map.put("strings", strings);
    }

}
