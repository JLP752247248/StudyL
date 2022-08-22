package com.couldtec.sys.auth.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "itms_complaint_log")
@Entity

public class ItmsComplaintLog implements Serializable {

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

    @Column(name = "complaint_msg")
    private String complaintMsg;

    @Column(name = "user_id")
    private String userId;

}
