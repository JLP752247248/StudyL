package com.couldtec.sys.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "SYS_AUTH_USER")

public class AuthUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:可用，1:删除，2:审核中
     */
    @Id
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "SEX", nullable = false)
    private Integer SEX;

    @Column(name = "BIRTHDAY", nullable = false)
    private Date BIRTHDAY;

    @Column(name = "ADDR")
    private String ADDR;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "MOBILE", nullable = false)
    private Long MOBILE;

    @Column(name = "CREATETIME", nullable = false)
    private Date CREATETIME;

    @Column(name = "UPDATETIME", nullable = false)
    private Date UPDATETIME;

    @Column(name = "STATUS", nullable = false)
    private Integer STATUS;

}
