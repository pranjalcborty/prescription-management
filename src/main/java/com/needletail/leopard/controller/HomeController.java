package com.needletail.leopard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/got", method = RequestMethod.GET)
    public String view(ModelMap model) {
        model.put("hello", "this is pranjal");
        return "index";
    }
}
