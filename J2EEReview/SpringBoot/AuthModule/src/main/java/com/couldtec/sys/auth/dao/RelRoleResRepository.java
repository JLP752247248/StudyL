package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.RelRoleRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RelRoleResRepository extends JpaRepository<RelRoleRes, Long>, JpaSpecificationExecutor<RelRoleRes> {

}