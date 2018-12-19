package cn.newbeedaly.springbootswaggerdemo.controller;

import cn.newbeedaly.springbootswaggerdemo.bean.User;
import cn.newbeedaly.springbootswaggerdemo.common.ResponseResult;
import cn.newbeedaly.springbootswaggerdemo.common.constant.ResponseCode;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 *
 * create by liqk on 2018/12/12
 */
@RestController
@RequestMapping(value = "/user", produces = "application/json")
@Api(value = "User", tags = {"User"}, description = "用户相关")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
  
  ///   ip:port/swagger_ui.html
  @GetMapping("/{id}")
  @ApiOperation(value = "使用ID查询用户")
  @ApiImplicitParams({
      @ApiImplicitParam(value = "ID", name = "id", dataType = "int", paramType = "path", required = true, defaultValue = "1")
  })
  @ApiResponses({
      @ApiResponse(code = 400, message = "请求参数有误"),
      @ApiResponse(code = 401, message = "未授权"),
      @ApiResponse(code = 403, message = "禁止访问"),
      @ApiResponse(code = 404, message = "请求路径不存在"),
      @ApiResponse(code = 500, message = "服务器内部错误")
  })
  public ResponseResult<User> getById(@PathVariable("id") Integer id) {
    logger.info("id::"+id);
    User user = new User();
    user.setId(1);
    user.setUsername("liqk");
    user.setPassword("pass");
    return ResponseResult.successWithData(user);
  }

  @PostMapping("")
  @ApiOperation(value = "创建用户")
  @ApiResponses({
      @ApiResponse(code = 400, message = "请求参数有误"),
      @ApiResponse(code = 401, message = "未授权"),
      @ApiResponse(code = 403, message = "禁止访问"),
      @ApiResponse(code = 404, message = "请求路径不存在"),
      @ApiResponse(code = 500, message = "服务器内部错误")
  })
  public ResponseResult<User> createUser(@Validated @RequestBody User user) {
    logger.info("user::"+user);
    return ResponseResult.failWithCodeAndMsg(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMsg());
  }

}


