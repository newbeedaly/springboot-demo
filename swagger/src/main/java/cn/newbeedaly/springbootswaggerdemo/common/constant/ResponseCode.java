package cn.newbeedaly.springbootswaggerdemo.common.constant;

import cn.newbeedaly.springbootswaggerdemo.common.ResponseResult;
import static cn.newbeedaly.springbootswaggerdemo.common.ResponseResult.ResponseParam.buildParam;

/**
 * 响应码
 *
 * create by liqk on 2018/12/12
 */
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS(buildParam(0, "成功")),ERROR(buildParam(1, "错误"));

    public final ResponseResult.ResponseParam PARAM;

    ResponseCode(ResponseResult.ResponseParam param) {
        this.PARAM = param;
    }

    public int getCode() {
        return this.PARAM.getCode();
    }

    public String getMsg() {
        return this.PARAM.getMsg();
    }
}
