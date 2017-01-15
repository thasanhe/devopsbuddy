package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kingoftheroad on 1/16/17.
 */
@Controller
public class LogInController {

    /** The log in view name */
    public static final String LOG_IN_VIEW_NAME = "user/login";

    @RequestMapping("/login")
    public String login(){
        return LOG_IN_VIEW_NAME;
    }
}
