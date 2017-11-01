package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/1.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return  "hello spring boot .....!";
    }
}
