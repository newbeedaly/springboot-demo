package cn.newbeedaly.springbootswaggerdemo.controller;

import cn.newbeedaly.springbootswaggerdemo.bean.Student;
import cn.newbeedaly.springbootswaggerdemo.common.ApiResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Hello world!
 *
 */
@Api(description = "用户接口")
@RestController
@RequestMapping("/studentController")
public class StudentController {

  @ApiOperation(value = "新增用户" ,  notes="新增注册")
  @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
  public ApiResult createUser(@RequestBody Student user){
    System.out.println("createUser:::"+user.toString());
    return new ApiResult("0000", "新增成功.","");
  }

  @ApiOperation(value = "修改用户" ,  notes="修改用户")
  @RequestMapping(value="/updateUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
  public ApiResult updateUser(@RequestBody Student user){
    System.out.println("updateUser:::"+user.toString());
    return new ApiResult("0000", "修改成功.","");
  }

  @ApiOperation(value = "删除用户" ,  notes="删除用户")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "delete", dataType = "String")
  })
  @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
  public ApiResult deleteUser(@RequestParam("userId") String userId){
    System.out.println("deleteUser:::"+userId);
    return new ApiResult("0000", "删除成功.","");
  }

  @ApiOperation(value = "查询用户" ,  notes="查询用户")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
  })
  @RequestMapping(value="/queryUser",method=RequestMethod.GET)
  public ApiResult queryUser(@RequestParam("userId") String userId){
    System.out.println("queryUser:::"+userId);
    Student student = new Student();
    return new ApiResult("0000", "查询成功.",student);
  }

}