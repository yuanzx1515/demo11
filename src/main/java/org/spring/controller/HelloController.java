package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
@Controller
public class HelloController {

    @RequestMapping("/a")
    public ModelAndView hello(Model model) {
        model.addAttribute("name", "Hello World");
      return new ModelAndView("index");
    }


    @RequestMapping("/b")
    public ModelAndView test(Model model) {
        model.addAttribute("name", "yzx");
        return new ModelAndView("index");
    }
}