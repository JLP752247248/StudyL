package com.couldtec.sys.auth.dao;

import com.couldtec.sys.auth.entity.TbFileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbFileInfoRepository extends JpaRepository<TbFileInfo, String>, JpaSpecificationExecutor<TbFileInfo> {

}