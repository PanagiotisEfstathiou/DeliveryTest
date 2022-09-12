package com.example.test;



public interface AccountService extends BaseService<Account> {

    Account findByEmail(final String email);
}
