package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/3.
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
}
