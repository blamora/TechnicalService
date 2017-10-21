package com.datecsa.model;

import org.hibernate.validator.constraints.*;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "dataorigin", schema = "public")
public class Dataorigin implements java.io.Serializable {
    @Id
    @NotNull
    private Integer dataoriginId;
    private String dataoriginCompany;
    private String dataoriginCompletdate;
    private String dataoriginCompletstatus;
    private String dataoriginCoursename;
    private String dataoriginDealernumber;
    private String dataoriginFirstname;
    private String dataoriginLastname;
    private String dataoriginRegisdate;
    private String dataoriginRegiststatus;
    private Integer dataoriginScore;
    private String dataoriginTerritory;
    private String dataoriginUsername;
    private String dataoriginUserstatus;

    public Dataorigin() {
    }

    public Dataorigin(Integer dataoriginId, String dataoriginCompany,
        String dataoriginCompletdate, String dataoriginCompletstatus,
        String dataoriginCoursename, String dataoriginDealernumber,
        String dataoriginFirstname, String dataoriginLastname,
        String dataoriginRegisdate, String dataoriginRegiststatus,
        Integer dataoriginScore, String dataoriginTerritory,
        String dataoriginUsername, String dataoriginUserstatus) {
        this.dataoriginId = dataoriginId;
        this.dataoriginCompany = dataoriginCompany;
        this.dataoriginCompletdate = dataoriginCompletdate;
        this.dataoriginCompletstatus = dataoriginCompletstatus;
        this.dataoriginCoursename = dataoriginCoursename;
        this.dataoriginDealernumber = dataoriginDealernumber;
        this.dataoriginFirstname = dataoriginFirstname;
        this.dataoriginLastname = dataoriginLastname;
        this.dataoriginRegisdate = dataoriginRegisdate;
        this.dataoriginRegiststatus = dataoriginRegiststatus;
        this.dataoriginScore = dataoriginScore;
        this.dataoriginTerritory = dataoriginTerritory;
        this.dataoriginUsername = dataoriginUsername;
        this.dataoriginUserstatus = dataoriginUserstatus;
    }

    public Integer getDataoriginId() {
        return this.dataoriginId;
    }

    public void setDataoriginId(Integer dataoriginId) {
        this.dataoriginId = dataoriginId;
    }

    public String getDataoriginCompany() {
        return this.dataoriginCompany;
    }

    public void setDataoriginCompany(String dataoriginCompany) {
        this.dataoriginCompany = dataoriginCompany;
    }

    public String getDataoriginCompletdate() {
        return this.dataoriginCompletdate;
    }

    public void setDataoriginCompletdate(String dataoriginCompletdate) {
        this.dataoriginCompletdate = dataoriginCompletdate;
    }

    public String getDataoriginCompletstatus() {
        return this.dataoriginCompletstatus;
    }

    public void setDataoriginCompletstatus(String dataoriginCompletstatus) {
        this.dataoriginCompletstatus = dataoriginCompletstatus;
    }

    public String getDataoriginCoursename() {
        return this.dataoriginCoursename;
    }

    public void setDataoriginCoursename(String dataoriginCoursename) {
        this.dataoriginCoursename = dataoriginCoursename;
    }

    public String getDataoriginDealernumber() {
        return this.dataoriginDealernumber;
    }

    public void setDataoriginDealernumber(String dataoriginDealernumber) {
        this.dataoriginDealernumber = dataoriginDealernumber;
    }

    public String getDataoriginFirstname() {
        return this.dataoriginFirstname;
    }

    public void setDataoriginFirstname(String dataoriginFirstname) {
        this.dataoriginFirstname = dataoriginFirstname;
    }

    public String getDataoriginLastname() {
        return this.dataoriginLastname;
    }

    public void setDataoriginLastname(String dataoriginLastname) {
        this.dataoriginLastname = dataoriginLastname;
    }

    public String getDataoriginRegisdate() {
        return this.dataoriginRegisdate;
    }

    public void setDataoriginRegisdate(String dataoriginRegisdate) {
        this.dataoriginRegisdate = dataoriginRegisdate;
    }

    public String getDataoriginRegiststatus() {
        return this.dataoriginRegiststatus;
    }

    public void setDataoriginRegiststatus(String dataoriginRegiststatus) {
        this.dataoriginRegiststatus = dataoriginRegiststatus;
    }

    public Integer getDataoriginScore() {
        return this.dataoriginScore;
    }

    public void setDataoriginScore(Integer dataoriginScore) {
        this.dataoriginScore = dataoriginScore;
    }

    public String getDataoriginTerritory() {
        return this.dataoriginTerritory;
    }

    public void setDataoriginTerritory(String dataoriginTerritory) {
        this.dataoriginTerritory = dataoriginTerritory;
    }

    public String getDataoriginUsername() {
        return this.dataoriginUsername;
    }

    public void setDataoriginUsername(String dataoriginUsername) {
        this.dataoriginUsername = dataoriginUsername;
    }

    public String getDataoriginUserstatus() {
        return this.dataoriginUserstatus;
    }

    public void setDataoriginUserstatus(String dataoriginUserstatus) {
        this.dataoriginUserstatus = dataoriginUserstatus;
    }
}
