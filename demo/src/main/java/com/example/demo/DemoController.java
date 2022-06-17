package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
  
  public DemoController(){}
  @RequestMapping("/")
  public ModelAndView index(ModelAndView mv){
    mv.setViewName("index");

    mv.addObject("title","サンプル from Model And View Object");
    mv.addObject("detail","タスクの詳細");

    return mv;
  }

}
