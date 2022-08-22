package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.ItmsBssuserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ItmsBssuserInfoRepository extends JpaRepository<ItmsBssuserInfo, String>, JpaSpecificationExecutor<ItmsBssuserInfo> {

}