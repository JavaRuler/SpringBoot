package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/2.
 */
//@Component
//@ConfigurationProperties(prefix = "User")
public class User {

    private String id;

    private String name;

    private Integer age;

    private String sax;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSax() {
        return sax;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSax(String sax) {
        this.sax = sax;
    }

}
