package com.kbw0226.managerpg.domain.account.service;


import com.kbw0226.managerpg.domain.account.entitiy.Account;
import com.kbw0226.managerpg.domain.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;

    public Account addAccount(String name) {
        Account account = Account.builder()
                .name(name).build();

        accountRepository.save(account);
        return account;

    }
}
