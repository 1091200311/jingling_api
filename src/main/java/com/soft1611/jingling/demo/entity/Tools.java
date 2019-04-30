package com.soft1611.jingling.demo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Tools {

    @Id
    @GeneratedValue
    private Integer id;
    private String pic;
    private String name;
    private String desc;
}
