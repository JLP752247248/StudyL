package com.couldtec.webserver.apps.entity.requestmodels;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;


public class CallbackMsg
{

  @ApiModelProperty(required=true, name="requ_id", value="回调消息体")
  @NotNull
  private String msg;

  public String getMsg()
  {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}