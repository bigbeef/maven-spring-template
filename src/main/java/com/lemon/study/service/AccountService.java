package com.lemon.study.service;

import com.lemon.study.repository.entity.Account;

/**
 * Created by limeng0402 on 14-11-2.
 */
public interface AccountService {
    public Account createNewAccount(String name, String phone);
}
