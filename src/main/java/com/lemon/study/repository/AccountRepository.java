package com.lemon.study.repository;

import com.lemon.study.repository.entity.Account;
import org.springframework.data.repository.Repository;

/**
 * Created by limeng0402 on 14-11-1.
 */
@org.springframework.stereotype.Repository
public interface AccountRepository extends Repository<Account, Long> {
    public Account save(Account account);
}
