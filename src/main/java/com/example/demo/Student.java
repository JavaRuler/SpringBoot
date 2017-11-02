package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/11/2.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;
}
