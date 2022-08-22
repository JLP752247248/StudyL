package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.SysUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysUserInfoRepository extends JpaRepository<SysUserInfo, String>, JpaSpecificationExecutor<SysUserInfo> {

}