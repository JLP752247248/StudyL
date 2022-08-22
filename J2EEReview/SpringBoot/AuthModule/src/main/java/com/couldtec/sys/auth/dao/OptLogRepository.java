package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.OptLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OptLogRepository extends JpaRepository<OptLog, String>, JpaSpecificationExecutor<OptLog> {

}