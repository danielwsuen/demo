package com.daniel.entity;

import lombok.Data;

@Data
public class Person {
    private String id;
    private String name;
    private Integer age;

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
