package cn.newbeedaly.springbootswaggerdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Student Model")
public class Student {

  // mark 此类中不能使用构造方法

  @ApiModelProperty(value = "用户名", name = "id", example = "null")
  private String id;

  @ApiModelProperty(value = "用户名", name = "username", required = true, example = "liqk")
  private String username;

  @ApiModelProperty(value = "用户名", name = "password", required = true, example = "pass*w*d")
  private String password;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
