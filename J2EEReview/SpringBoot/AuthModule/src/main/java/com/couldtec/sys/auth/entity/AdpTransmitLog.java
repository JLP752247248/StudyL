package com.couldtec.sys.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "adp_transmit_log")
public class AdpTransmitLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "trans_id", nullable = false)
    private Long transId;

    @Column(name = "city_code", nullable = false)
    private Integer cityCode;

    @Column(name = "prov_code", nullable = false)
    private Integer provCode;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "time")
    private Date time;

    @Column(name = "method_name")
    private String methodName;

    @Column(name = "method_type", nullable = false)
    private Integer methodType;

    @Column(name = "req_id")
    private String reqId;

    @Column(name = "in_put_str")
    private String inPutStr;

    @Column(name = "out_put_str")
    private String outPutStr;

    public AdpTransmitLog setTransId(Long transId) {
        this.transId = transId;
        return this;
    }

    public Long getTransId() {
        return transId;
    }

    public AdpTransmitLog setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public AdpTransmitLog setProvCode(Integer provCode) {
        this.provCode = provCode;
        return this;
    }

    public Integer getProvCode() {
        return provCode;
    }

    public AdpTransmitLog setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public AdpTransmitLog setTime(Date time) {
        this.time = time;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public AdpTransmitLog setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public String getMethodName() {
        return methodName;
    }

    public AdpTransmitLog setMethodType(Integer methodType) {
        this.methodType = methodType;
        return this;
    }

    public Integer getMethodType() {
        return methodType;
    }

    public AdpTransmitLog setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    public String getReqId() {
        return reqId;
    }

    public AdpTransmitLog setInPutStr(String inPutStr) {
        this.inPutStr = inPutStr;
        return this;
    }

    public String getInPutStr() {
        return inPutStr;
    }

    public AdpTransmitLog setOutPutStr(String outPutStr) {
        this.outPutStr = outPutStr;
        return this;
    }

    public String getOutPutStr() {
        return outPutStr;
    }

    @Override
    public String toString() {
        return "AdpTransmitLog{" +
                "transId=" + transId + '\'' +
                "cityCode=" + cityCode + '\'' +
                "provCode=" + provCode + '\'' +
                "requestId=" + requestId + '\'' +
                "time=" + time + '\'' +
                "methodName=" + methodName + '\'' +
                "methodType=" + methodType + '\'' +
                "reqId=" + reqId + '\'' +
                "inPutStr=" + inPutStr + '\'' +
                "outPutStr=" + outPutStr + '\'' +
                '}';
    }
}
