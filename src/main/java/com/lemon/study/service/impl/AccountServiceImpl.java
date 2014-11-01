package com.lemon.study.service.impl;

import com.lemon.study.repository.AccountRepository;
import com.lemon.study.repository.entity.Account;
import com.lemon.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by limeng0402 on 14-11-2.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account createNewAccount(String name, String phone) {
        Account account = new Account();
        account.setName(name);
        account.setPhone(phone);
        return accountRepository.save(account);
    }
}
