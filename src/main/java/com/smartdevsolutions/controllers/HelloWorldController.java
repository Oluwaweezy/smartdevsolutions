package com.smartdevsolutions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BinaryCodes_2
 *
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String SayHello()
    {
        return "index";
    }

}