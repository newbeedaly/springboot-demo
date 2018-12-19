package cn.newbeedaly.mybatis.controller;

import cn.newbeedaly.mybatis.bean.User;
import cn.newbeedaly.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/test")
  public User getUser() {
    User user = new User();
    user.setName("hello!");
    return user;
  }

  @RequestMapping("/getUser/{id}")
  public User selectUser (@PathVariable int id){
    return userService.selectUser(id);
  }

  @RequestMapping("/insert")
  public boolean insertUser() {
    try{
      userService.insertBatch();
    }catch (Exception e){
      return false;
    }
    return true;
  }
}
