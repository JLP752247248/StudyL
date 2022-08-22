package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.AuthResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthResourceRepository extends JpaRepository<AuthResource, Long>, JpaSpecificationExecutor<AuthResource> {

}