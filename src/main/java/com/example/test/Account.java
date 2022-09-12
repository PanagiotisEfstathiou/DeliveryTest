package com.example.test;

import com.sun.istack.NotNull;
import lombok.*;
import oracle.net.jdbc.TNSAddress.Address;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Setter
@Getter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACCOUNTS_TEST", indexes = {@Index(name = "ACCOUNTTest_IDX_01", columnList = "email, mobilePhone")})
@SequenceGenerator(name = "idGenerator", sequenceName = "ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)

public class Account extends BaseModel {
    @Column(length = 20, nullable = false)
    private String firstName;
    @Column(length = 20, nullable = false)
    private String lastName;
    @Column(length = 50, nullable = true, unique = true)
    private String email;

    @Column(length = 50)
    @Size(max = 50)
    private String address;

    @Column(length = 15, nullable = true, unique = true)
    private String mobilePhone;

    @Column(length = 15, nullable = false)
    private String password;
}
