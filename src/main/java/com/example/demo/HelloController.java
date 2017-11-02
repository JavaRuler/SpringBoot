package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/1.
 */
@RestController
public class HelloController {

    /*@Autowired
    private  User user;*/

    @GetMapping("/")
    public String index(){
        return  "hello spring boot .....!";
    }

    /*@GetMapping("/User")
    public String user(){
        return user.getId() + user.getName() + user.getAge() + user.getSax();
    }*/
}
