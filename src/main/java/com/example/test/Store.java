package com.example.test;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "STORESTEST", indexes = {@Index(name = "STORE_IDX_01", columnList = "storeName")})
@SequenceGenerator(name = "storeIdGenerator", sequenceName = "STORE_SEQ", allocationSize = 1)
@NoArgsConstructor
public class Store extends BaseModel {

    @Column(nullable=false, unique = true)
    private String storeName;

    @Column(nullable = false)
    private String storeRegion;


    @Enumerated(EnumType.STRING)
    @Column(length=15, nullable =false)
    private StoreCategory storeCategory;


    @Column
    @OneToMany()
    private List<Product> catalog;



}
