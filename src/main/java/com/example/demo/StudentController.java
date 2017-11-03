package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
@RestController
public class StudentController {

    /*@Autowired
    private  User user;*/
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public String index(){
        return  "hello spring boot .....!";
    }

    @GetMapping("/list")
    public List<Student> getStudents(){
        return studentDao.findAll();
    }

    @GetMapping("/{id}")
    public Student getSudent(@PathVariable("id") int id){
        return studentDao.findOne(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(Student student){
        Student student1 = new Student();
        student1.setId(student.getId());
        student1.setAge(student.getAge());
        student1.setName(student.getName());
        return studentDao.saveAndFlush(student1);
    }

    @PostMapping("/save")
    public Student saveStudent(Student student){
        Student student1 = new Student();
        student1.setAge(student.getAge());
        student1.setName(student.getName());
        return studentDao.save(student1);
    }

    @DeleteMapping("/{id}")
    public void delStudent(@PathVariable("id") int id){
       studentDao.delete(id);
    }

    /*@GetMapping("/User")
    public String user(){
        return user.getId() + user.getName() + user.getAge() + user.getSax();
    }*/
}
