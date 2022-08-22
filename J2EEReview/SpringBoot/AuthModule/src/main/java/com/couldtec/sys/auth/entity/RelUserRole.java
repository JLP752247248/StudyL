package com.couldtec.sys.auth.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Table(name = "SYS_REL_USER_ROLE")
@Entity

public class RelUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:可用，1:删除，2:审核中
     */
    @Id
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "USERID", nullable = false)
    private Long USERID;

    @Column(name = "ROLEID", nullable = false)
    private Long ROLEID;

    @Column(name = "CREATETIME", nullable = false)
    private Date CREATETIME;

    @Column(name = "UPDATETIME", nullable = false)
    private Date UPDATETIME;

    @Column(name = "STATUS", nullable = false)
    private Integer STATUS;

}
