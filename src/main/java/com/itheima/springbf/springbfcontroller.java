package com.itheima.springbf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springbfcontroller {

    @RequestMapping("/bfquike")
    public String quike() {

        return "Hello Handsome Boy's Springboot!";
    }
}
