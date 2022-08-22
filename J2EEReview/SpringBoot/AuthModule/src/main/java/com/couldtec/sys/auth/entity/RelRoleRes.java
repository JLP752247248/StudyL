package com.couldtec.sys.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "SYS_REL_ROLE_RES")

public class RelRoleRes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:可用，1:删除，2:审核中
     */
    @Id
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "ROLEID", nullable = false)
    private Long ROLEID;

    @Column(name = "RESOURCEID", nullable = false)
    private Long RESOURCEID;

    @Column(name = "CREATETIME", nullable = false)
    private Date CREATETIME;

    @Column(name = "UPDATETIME", nullable = false)
    private Date UPDATETIME;

    @Column(name = "STATUS", nullable = false)
    private Integer STATUS;

}
