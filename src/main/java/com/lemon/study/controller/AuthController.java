package com.lemon.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by limeng0402 on 14-11-1.
 */
@Controller
public class AuthController {

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(Model model) {
        return "signin";
    }
}
