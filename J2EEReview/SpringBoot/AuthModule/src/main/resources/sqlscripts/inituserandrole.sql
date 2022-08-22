CREATE TABLE `SYS_AUTH_USER` (
`ID` bigint(64) NOT NULL COMMENT '0:可用，1:删除，2:审核中',
`NAME` varchar(255) NOT NULL,
`SEX` int(1) NOT NULL DEFAULT 1,
`BIRTHDAY` date NOT NULL,
`ADDR` varchar(255) NULL DEFAULT NULL,
`EMAIL` varchar(64) NULL DEFAULT NULL,
`MOBILE` bigint(11) NOT NULL,
`CREATETIME` date NOT NULL,
`UPDATETIME` date NOT NULL,
`STATUS` smallint(1) NOT NULL DEFAULT 0,
PRIMARY KEY (`ID`)
);

CREATE TABLE `SYS_AUTH_ROLE` (
`ID` bigint(64) NOT NULL,
`NAME` varchar(32) NOT NULL,
`CREATETIME` date NOT NULL,
`UPDATETIME` date NOT NULL,
`STATUS` smallint(1) NOT NULL DEFAULT 0,
PRIMARY KEY (`ID`)
);

CREATE TABLE `SYS_AUTH_RESOURCE` (
`ID` bigint(64) NOT NULL,
`NAME` varchar(255) NOT NULL,
`TYPE` smallint(1) NOT NULL,
`CREATETIME` date NOT NULL,
`UPDATETIME` date NOT NULL,
`STATUS` smallint NOT NULL DEFAULT 0,
PRIMARY KEY (`ID`)
);

CREATE TABLE `SYS_REL_USER_ROLE` (
`ID` bigint(64) NOT NULL COMMENT '0:可用，1:删除，2:审核中',
`USERID` bigint(64) NOT NULL,
`ROLEID` bigint(64) NOT NULL,
`CREATETIME` date NOT NULL,
`UPDATETIME` date NOT NULL,
`STATUS` smallint(1) NOT NULL DEFAULT 0,
PRIMARY KEY (`ID`)
);

CREATE TABLE `SYS_REL_ROLE_RES` (
`ID` bigint(64) NOT NULL COMMENT '0:可用，1:删除，2:审核中',
`ROLEID` bigint NOT NULL,
`RESOURCEID` bigint NOT NULL,
`CREATETIME` date NOT NULL,
`UPDATETIME` date NOT NULL,
`STATUS` smallint(1) NOT NULL DEFAULT 0,
PRIMARY KEY (`ID`)
);

CREATE TABLE `SYS_IDGENERATOR` (
`IDNAME` varchar(100) NOT NULL,
`MAXID` bigint(64) NOT NULL DEFAULT 0,
PRIMARY KEY (`IDNAME`, `MAXID`)
);

CREATE TABLE `SYS_OPT_LOG` (
`ID` varchar(32) NOT NULL COMMENT '0:可用，1:删除，2:审核中',
`USERID` bigint NOT NULL,
`OPTTYPE` bigint NOT NULL,
`OPTINFO` varchar(255) NULL,
`OPTTIME` date NOT NULL,
PRIMARY KEY (`ID`)
);


ALTER TABLE `SYS_REL_USER_ROLE` ADD CONSTRAINT `FOR_REL_UR_USER` FOREIGN KEY (`USERID`) REFERENCES `SYS_AUTH_USER` (`ID`);
ALTER TABLE `SYS_REL_USER_ROLE` ADD CONSTRAINT `FOR_RLE_UR_ROLE` FOREIGN KEY (`ROLEID`) REFERENCES `SYS_AUTH_ROLE` (`ID`);
ALTER TABLE `SYS_REL_ROLE_RES` ADD CONSTRAINT `FOR_REL_RR_ROLE` FOREIGN KEY (`ROLEID`) REFERENCES `SYS_AUTH_ROLE` (`ID`);
ALTER TABLE `SYS_REL_ROLE_RES` ADD CONSTRAINT `FOR_REL_RR_RES` FOREIGN KEY (`RESOURCEID`) REFERENCES `SYS_AUTH_RESOURCE` (`ID`);
