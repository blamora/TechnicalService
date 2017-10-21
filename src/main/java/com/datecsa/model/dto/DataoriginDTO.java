package com.datecsa.model.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.util.Date;


/**
*
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public class DataoriginDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(DataoriginDTO.class);
    private String dataoriginCompany;
    private String dataoriginCompletdate;
    private String dataoriginCompletstatus;
    private String dataoriginCoursename;
    private String dataoriginDealernumber;
    private String dataoriginFirstname;
    private Integer dataoriginId;
    private String dataoriginLastname;
    private String dataoriginRegisdate;
    private String dataoriginRegiststatus;
    private Integer dataoriginScore;
    private String dataoriginTerritory;
    private String dataoriginUsername;
    private String dataoriginUserstatus;

    public String getDataoriginCompany() {
        return dataoriginCompany;
    }

    public void setDataoriginCompany(String dataoriginCompany) {
        this.dataoriginCompany = dataoriginCompany;
    }

    public String getDataoriginCompletdate() {
        return dataoriginCompletdate;
    }

    public void setDataoriginCompletdate(String dataoriginCompletdate) {
        this.dataoriginCompletdate = dataoriginCompletdate;
    }

    public String getDataoriginCompletstatus() {
        return dataoriginCompletstatus;
    }

    public void setDataoriginCompletstatus(String dataoriginCompletstatus) {
        this.dataoriginCompletstatus = dataoriginCompletstatus;
    }

    public String getDataoriginCoursename() {
        return dataoriginCoursename;
    }

    public void setDataoriginCoursename(String dataoriginCoursename) {
        this.dataoriginCoursename = dataoriginCoursename;
    }

    public String getDataoriginDealernumber() {
        return dataoriginDealernumber;
    }

    public void setDataoriginDealernumber(String dataoriginDealernumber) {
        this.dataoriginDealernumber = dataoriginDealernumber;
    }

    public String getDataoriginFirstname() {
        return dataoriginFirstname;
    }

    public void setDataoriginFirstname(String dataoriginFirstname) {
        this.dataoriginFirstname = dataoriginFirstname;
    }

    public Integer getDataoriginId() {
        return dataoriginId;
    }

    public void setDataoriginId(Integer dataoriginId) {
        this.dataoriginId = dataoriginId;
    }

    public String getDataoriginLastname() {
        return dataoriginLastname;
    }

    public void setDataoriginLastname(String dataoriginLastname) {
        this.dataoriginLastname = dataoriginLastname;
    }

    public String getDataoriginRegisdate() {
        return dataoriginRegisdate;
    }

    public void setDataoriginRegisdate(String dataoriginRegisdate) {
        this.dataoriginRegisdate = dataoriginRegisdate;
    }

    public String getDataoriginRegiststatus() {
        return dataoriginRegiststatus;
    }

    public void setDataoriginRegiststatus(String dataoriginRegiststatus) {
        this.dataoriginRegiststatus = dataoriginRegiststatus;
    }

    public Integer getDataoriginScore() {
        return dataoriginScore;
    }

    public void setDataoriginScore(Integer dataoriginScore) {
        this.dataoriginScore = dataoriginScore;
    }

    public String getDataoriginTerritory() {
        return dataoriginTerritory;
    }

    public void setDataoriginTerritory(String dataoriginTerritory) {
        this.dataoriginTerritory = dataoriginTerritory;
    }

    public String getDataoriginUsername() {
        return dataoriginUsername;
    }

    public void setDataoriginUsername(String dataoriginUsername) {
        this.dataoriginUsername = dataoriginUsername;
    }

    public String getDataoriginUserstatus() {
        return dataoriginUserstatus;
    }

    public void setDataoriginUserstatus(String dataoriginUserstatus) {
        this.dataoriginUserstatus = dataoriginUserstatus;
    }
}
