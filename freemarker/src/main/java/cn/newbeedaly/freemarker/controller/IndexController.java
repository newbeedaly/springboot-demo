package cn.newbeedaly.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {


  @RequestMapping(value = "/login")
  public ModelAndView index(ModelAndView modelAndView) {
    modelAndView.setViewName("index");

    List<String> userList=new ArrayList<String>();
    userList.add("admin");
    userList.add("user1");
    userList.add("user2");

    modelAndView.addObject("userList", userList);
    return modelAndView;
  }

}
