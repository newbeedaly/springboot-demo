package cn.newbeedaly.springbootswaggerdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;

/**
 * 用户类
 *
 * create by liqk on 2018/12/12
 */
@Data
@Entity(name = "users")
@ApiModel(description = "用户Model")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Null(message = "id必须为空")
  @ApiModelProperty(value = "用户ID", name = "id",example = "")
  private Integer id;

  @Column
  @NotBlank(message = "用户名不能为空")
  @ApiModelProperty(value = "用户名", name = "username", required = true, example = "liqk")
  private String username;

  @Column
  @NotBlank(message = "密码不能为空")
  @ApiModelProperty(value = "密码", name = "password", required = true, example = "123456")
  private String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

