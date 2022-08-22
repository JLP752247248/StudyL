package com.couldtec.webserver.apps.restful.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.couldtec.webserver.apps.entity.MsgInfo;
import com.couldtec.webserver.apps.restful.dao.UserInfoDao;
import com.couldtec.webserver.apps.restful.h2entity.UserInfo;

@Controller
@RequestMapping({"/user"})
public class UserController
{
  public static final Logger logger = LoggerFactory.getLogger(UserController.class);
  @Resource
  private UserInfoDao dao;
  @RequestMapping(value={"/info"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  @ResponseBody
  public MsgInfo info(HttpServletRequest req,@RequestParam String userName)
  throws Exception
  {
	  UserInfo obj=dao.findByUserNameOrEmailOrMobile(userName,userName,userName);
	  if(null==obj){
		  return new MsgInfo(null,"未查到用户",userName,MsgInfo.RespCode.FAILED);
	  }
	  return new MsgInfo(null,"查到用户",userName,MsgInfo.RespCode.SUCCESS);
  }
  @RequestMapping(value={"/login"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  @ResponseBody
  public MsgInfo log(HttpServletRequest req,@RequestBody UserInfo user)
   
  {
	 UserInfo obj=dao.findByUserNameOrEmailOrMobile(user.getUserName(), user.getUserName(), user.getUserName());
	 if(obj==null){
		 return new MsgInfo(user.getRequestId(),"xxxx",obj,MsgInfo.RespCode.FAILED);
	 }
	 
     return new MsgInfo(user.getRequestId(),"xxxx",obj,MsgInfo.RespCode.SUCCESS);
  }
  @RequestMapping(value={"/registe"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  @ResponseBody
  public MsgInfo regist(HttpServletRequest req,@RequestBody UserInfo user)
    
  {
	 UserInfo obj=dao.save(user);
	 if(null==obj){
		  return new MsgInfo(null,"注册成功",obj,MsgInfo.RespCode.FAILED);
	 }
	 return new MsgInfo(null,"注册失败",obj,MsgInfo.RespCode.SUCCESS);
  }
}