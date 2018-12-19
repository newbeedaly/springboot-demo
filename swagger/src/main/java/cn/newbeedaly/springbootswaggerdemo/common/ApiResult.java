package cn.newbeedaly.springbootswaggerdemo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "响应学生对象")
public class ApiResult {

  private static final int SUCCESS_CODE = 0;
  private static final String SUCCESS_MESSAGE = "成功";

  @ApiModelProperty(value = "响应码", name = "code", required = true, example = "" + SUCCESS_CODE)
  private String code;
  @ApiModelProperty(value = "响应消息", name = "msg", required = true, example = SUCCESS_MESSAGE)
  private String msg;
  @ApiModelProperty(value = "响应对象", name = "object")
  private Object object;

  public ApiResult(String code, String msg, Object object) {
    this.code = code;
    this.msg = msg;
    this.object = object;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }
}
