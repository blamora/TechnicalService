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
public class DatafinalDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(DatafinalDTO.class);
    private String datafinalCompany;
    private String datafinalCompletdate;
    private String datafinalCompletstatus;
    private String datafinalCoursename;
    private String datafinalDealernumber;
    private String datafinalFirstname;
    private Integer datafinalId;
    private String datafinalLastname;
    private String datafinalRegisdate;
    private String datafinalRegiststatus;
    private Integer datafinalScore;
    private String datafinalTerritory;
    private String datafinalUsername;
    private String datafinalUserstatus;

    public String getDatafinalCompany() {
        return datafinalCompany;
    }

    public void setDatafinalCompany(String datafinalCompany) {
        this.datafinalCompany = datafinalCompany;
    }

    public String getDatafinalCompletdate() {
        return datafinalCompletdate;
    }

    public void setDatafinalCompletdate(String datafinalCompletdate) {
        this.datafinalCompletdate = datafinalCompletdate;
    }

    public String getDatafinalCompletstatus() {
        return datafinalCompletstatus;
    }

    public void setDatafinalCompletstatus(String datafinalCompletstatus) {
        this.datafinalCompletstatus = datafinalCompletstatus;
    }

    public String getDatafinalCoursename() {
        return datafinalCoursename;
    }

    public void setDatafinalCoursename(String datafinalCoursename) {
        this.datafinalCoursename = datafinalCoursename;
    }

    public String getDatafinalDealernumber() {
        return datafinalDealernumber;
    }

    public void setDatafinalDealernumber(String datafinalDealernumber) {
        this.datafinalDealernumber = datafinalDealernumber;
    }

    public String getDatafinalFirstname() {
        return datafinalFirstname;
    }

    public void setDatafinalFirstname(String datafinalFirstname) {
        this.datafinalFirstname = datafinalFirstname;
    }

    public Integer getDatafinalId() {
        return datafinalId;
    }

    public void setDatafinalId(Integer datafinalId) {
        this.datafinalId = datafinalId;
    }

    public String getDatafinalLastname() {
        return datafinalLastname;
    }

    public void setDatafinalLastname(String datafinalLastname) {
        this.datafinalLastname = datafinalLastname;
    }

    public String getDatafinalRegisdate() {
        return datafinalRegisdate;
    }

    public void setDatafinalRegisdate(String datafinalRegisdate) {
        this.datafinalRegisdate = datafinalRegisdate;
    }

    public String getDatafinalRegiststatus() {
        return datafinalRegiststatus;
    }

    public void setDatafinalRegiststatus(String datafinalRegiststatus) {
        this.datafinalRegiststatus = datafinalRegiststatus;
    }

    public Integer getDatafinalScore() {
        return datafinalScore;
    }

    public void setDatafinalScore(Integer datafinalScore) {
        this.datafinalScore = datafinalScore;
    }

    public String getDatafinalTerritory() {
        return datafinalTerritory;
    }

    public void setDatafinalTerritory(String datafinalTerritory) {
        this.datafinalTerritory = datafinalTerritory;
    }

    public String getDatafinalUsername() {
        return datafinalUsername;
    }

    public void setDatafinalUsername(String datafinalUsername) {
        this.datafinalUsername = datafinalUsername;
    }

    public String getDatafinalUserstatus() {
        return datafinalUserstatus;
    }

    public void setDatafinalUserstatus(String datafinalUserstatus) {
        this.datafinalUserstatus = datafinalUserstatus;
    }
}
