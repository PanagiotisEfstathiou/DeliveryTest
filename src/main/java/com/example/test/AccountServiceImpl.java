package com.example.test;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }

    public Account findByEmail(final String email){
        return accountRepository.findByEmail(email);
    }

    public Account findByMobilePhone(final String mobilePhone){
        return accountRepository.findByMobilePhone(mobilePhone);
    }
}
