package com.couldtec.sys.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_user_info")

public class SysUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "city_code", nullable = false)
    private Integer cityCode;

    @Column(name = "prov_code", nullable = false)
    private Integer provCode;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "time")
    private Date time;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "passwd")
    private String passwd;

    @Column(name = "user_level", nullable = false)
    private Integer userLevel;

    @Column(name = "user_name")
    private String userName;

}
