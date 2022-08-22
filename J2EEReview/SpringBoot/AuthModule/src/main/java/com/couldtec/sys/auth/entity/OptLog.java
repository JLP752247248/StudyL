package com.couldtec.sys.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "SYS_OPT_LOG")
public class OptLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:可用，1:删除，2:审核中
     */
    @Id
    @Column(name = "ID", nullable = false)
    private String ID;

    @Column(name = "USERID", nullable = false)
    private Long USERID;

    @Column(name = "OPTTYPE", nullable = false)
    private Long OPTTYPE;

    @Column(name = "OPTINFO")
    private String OPTINFO;

    @Column(name = "OPTTIME", nullable = false)
    private Date OPTTIME;

}
