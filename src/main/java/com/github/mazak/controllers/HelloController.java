package com.github.mazak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import java.util.HashMap;

@Controller
class HelloController {
    @RequestMapping(value="/help")
    Map help() {
        Map attrs = new HashMap();
        attrs.put("abc", "hereyea");
        return attrs;
    }
    @RequestMapping(value="/wicket")
    ModelAndView wicket() {
        Map attrs = new HashMap();
        attrs.put("abc", "babye");
        ModelAndView mav = new ModelAndView("wicket.jsp");
		mav.addObject("attrs", attrs);
        return mav;
    }
}