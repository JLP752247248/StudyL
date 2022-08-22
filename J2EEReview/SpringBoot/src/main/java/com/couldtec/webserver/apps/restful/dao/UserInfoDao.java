package com.couldtec.webserver.apps.restful.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couldtec.webserver.apps.restful.h2entity.UserInfo;

public abstract interface UserInfoDao extends JpaRepository<UserInfo, String>
{
	UserInfo findByUserName(String userName);
	UserInfo findByUserNameOrEmailOrMobile(String userName,String email,String mobile);
}