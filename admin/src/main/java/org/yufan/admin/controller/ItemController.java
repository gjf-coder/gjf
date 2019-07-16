package org.yufan.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/item")
@Controller
@ResponseBody
public class ItemController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello xxx");
        return "qq";
    }

}
