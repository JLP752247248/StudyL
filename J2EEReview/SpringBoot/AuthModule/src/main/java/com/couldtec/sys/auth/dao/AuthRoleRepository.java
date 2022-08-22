package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthRoleRepository extends JpaRepository<AuthRole, Long>, JpaSpecificationExecutor<AuthRole> {

}