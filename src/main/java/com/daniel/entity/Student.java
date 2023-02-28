package com.daniel.entity;

import java.math.BigDecimal;

public class Student {

    private Integer id;
    private String name;
    private BigDecimal score;

    public Student(Integer id, String name, BigDecimal score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
