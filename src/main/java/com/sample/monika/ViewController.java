package com.sample.monika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("index.html");
    }


    @RequestMapping(value = "/next/page" , method = RequestMethod.GET)
    public ModelAndView next(){
        return new ModelAndView("page.html");
    }
}
