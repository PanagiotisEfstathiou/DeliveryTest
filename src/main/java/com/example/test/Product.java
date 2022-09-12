package com.example.test;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCTSTEST")
public class Product extends BaseModel {

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String serial;

    @Column(precision = 10, scale = 2, nullable = false)
    private double price;



}
