package com.lemon.study.controller;

import com.lemon.study.repository.entity.Account;
import com.lemon.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by limeng0402 on 14-11-1.
 */
@Controller
public class AuthController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(Model model) {
        model.addAttribute(new Account());
        return "signin";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String welcome(Account account, Model model) {
        accountService.createNewAccount(account.getName(), account.getPhone());
        model.addAttribute("name", account.getName());
        return "welcome";
    }
}
