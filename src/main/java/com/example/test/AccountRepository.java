package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByEmail(String email);

    Account findByMobilePhone(String mobilePhone);
}
