package com.couldtec.sys.auth.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity

@Table(name = "clo_msginfo")
public class CloMsginfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "city_code", nullable = false)
    private Integer cityCode;

    @Column(name = "prov_code", nullable = false)
    private Integer provCode;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "time")
    private Date time;

    @Column(name = "msg_content")
    private String msgContent;

    @Column(name = "req_id")
    private String reqId;

}
