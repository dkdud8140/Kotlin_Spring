package com.callor.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/st")
public class StudentController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  String list() {
        return "ST/list";
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public  String detail() {
        return "ST/detail";
    }

    @RequestMapping(value = "/write",method = RequestMethod.GET)
    public  String write() {
        return "ST/write";
    }
}
