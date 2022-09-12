package com.example.test;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItem extends BaseModel{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Order order;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Product product;

    @Column(nullable = false)
    @NotNull
    private int quantity;

    @Column(precision = 10, scale = 2, nullable = false)
    @NotNull
    private double price;

    @Column
    private String notes;
}
