package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.RelUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RelUserRoleRepository extends JpaRepository<RelUserRole, Long>, JpaSpecificationExecutor<RelUserRole> {

}