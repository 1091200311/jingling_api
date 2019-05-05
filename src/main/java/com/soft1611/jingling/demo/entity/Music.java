package com.soft1611.jingling.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Music {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String likes;
}
