package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.CloMsginfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CloMsginfoRepository extends JpaRepository<CloMsginfo, String>, JpaSpecificationExecutor<CloMsginfo> {

}