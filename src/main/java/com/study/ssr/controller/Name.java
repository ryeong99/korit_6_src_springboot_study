package com.study.ssr.controller;

import com.study.ssr.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Name {

    @GetMapping("/name")
    public ModelAndView namepage() {
        ModelAndView nam = new ModelAndView();
        nam.setViewName("views/name");
        nam.addObject(Student.builder().name("김준일").age(31).build());
        return nam;
    }
}
