package cn.newbeedaly.mybatis.service;

import cn.newbeedaly.mybatis.bean.User;
import cn.newbeedaly.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

  @Autowired
  UserMapper userMapper;

  public User selectUser(int id) {
    return userMapper.selectUser(id);
  }

  @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
  public boolean insertBatch() throws Exception{
       User user = new User();
       user.setName("周星驰");
       user.setAge(34);
       userMapper.insertUser(user);
       int a = 1/0;
       userMapper.insertUser(user);
       return true;
  }

}
