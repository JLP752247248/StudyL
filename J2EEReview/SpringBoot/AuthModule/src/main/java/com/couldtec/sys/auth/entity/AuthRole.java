package com.couldtec.sys.auth.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "SYS_AUTH_ROLE")

public class AuthRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "CREATETIME", nullable = false)
    private Date CREATETIME;

    @Column(name = "UPDATETIME", nullable = false)
    private Date UPDATETIME;

    @Column(name = "STATUS", nullable = false)
    private Integer STATUS;

}
