package com.daniel.pack01;

import com.daniel.entity.Student;

import java.math.BigDecimal;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("id", "123");
        map.put("amount", "12.34");

        Student stu = new Student();
        Student student = MapUtils.fromMap(stu, map);
        System.out.println(student.toString());
    }
}
