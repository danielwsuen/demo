package com.daniel.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Category {
    @Id
    private String cateId;
    private String cateName;
}
