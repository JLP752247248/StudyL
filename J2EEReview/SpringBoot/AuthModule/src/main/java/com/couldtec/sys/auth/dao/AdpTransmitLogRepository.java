package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.AdpTransmitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdpTransmitLogRepository extends JpaRepository<AdpTransmitLog, Long>, JpaSpecificationExecutor<AdpTransmitLog> {

}