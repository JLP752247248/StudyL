package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.ItmsComplaintLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ItmsComplaintLogRepository extends JpaRepository<ItmsComplaintLog, String>, JpaSpecificationExecutor<ItmsComplaintLog> {

}