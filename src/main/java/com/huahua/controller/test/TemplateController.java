package com.huahua.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by GM on 2017/9/12.
 */
@Controller
public class TemplateController {
    /**
     * 返回thymeleaf模板
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }
}
