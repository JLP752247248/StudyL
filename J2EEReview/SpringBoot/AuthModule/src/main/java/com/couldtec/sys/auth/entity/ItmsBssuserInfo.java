package com.couldtec.sys.auth.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "itms_bssuser_info")

public class ItmsBssuserInfo implements Serializable {

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

    @Column(name = "account")
    private String account;

    @Column(name = "address")
    private String address;

    @Column(name = "contact")
    private String contact;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "detail")
    private String detail;

    @Column(name = "loid")
    private String loid;

    @Column(name = "series_number")
    private String seriesNumber;

    @Column(name = "tape_width", nullable = false)
    private Integer tapeWidth;

    @Column(name = "user_level", nullable = false)
    private Integer userLevel;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

}
