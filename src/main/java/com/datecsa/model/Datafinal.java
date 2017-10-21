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
@Table(name = "datafinal", schema = "public")
public class Datafinal implements java.io.Serializable {
    @Id
    @NotNull
    private Integer datafinalId;
    private String datafinalCompany;
    private String datafinalCompletdate;
    private String datafinalCompletstatus;
    private String datafinalCoursename;
    private String datafinalDealernumber;
    private String datafinalFirstname;
    private String datafinalLastname;
    private String datafinalRegisdate;
    private String datafinalRegiststatus;
    private Integer datafinalScore;
    private String datafinalTerritory;
    private String datafinalUsername;
    private String datafinalUserstatus;

    public Datafinal() {
    }

    public Datafinal(Integer datafinalId, String datafinalCompany,
        String datafinalCompletdate, String datafinalCompletstatus,
        String datafinalCoursename, String datafinalDealernumber,
        String datafinalFirstname, String datafinalLastname,
        String datafinalRegisdate, String datafinalRegiststatus,
        Integer datafinalScore, String datafinalTerritory,
        String datafinalUsername, String datafinalUserstatus) {
        this.datafinalId = datafinalId;
        this.datafinalCompany = datafinalCompany;
        this.datafinalCompletdate = datafinalCompletdate;
        this.datafinalCompletstatus = datafinalCompletstatus;
        this.datafinalCoursename = datafinalCoursename;
        this.datafinalDealernumber = datafinalDealernumber;
        this.datafinalFirstname = datafinalFirstname;
        this.datafinalLastname = datafinalLastname;
        this.datafinalRegisdate = datafinalRegisdate;
        this.datafinalRegiststatus = datafinalRegiststatus;
        this.datafinalScore = datafinalScore;
        this.datafinalTerritory = datafinalTerritory;
        this.datafinalUsername = datafinalUsername;
        this.datafinalUserstatus = datafinalUserstatus;
    }

    public Integer getDatafinalId() {
        return this.datafinalId;
    }

    public void setDatafinalId(Integer datafinalId) {
        this.datafinalId = datafinalId;
    }

    public String getDatafinalCompany() {
        return this.datafinalCompany;
    }

    public void setDatafinalCompany(String datafinalCompany) {
        this.datafinalCompany = datafinalCompany;
    }

    public String getDatafinalCompletdate() {
        return this.datafinalCompletdate;
    }

    public void setDatafinalCompletdate(String datafinalCompletdate) {
        this.datafinalCompletdate = datafinalCompletdate;
    }

    public String getDatafinalCompletstatus() {
        return this.datafinalCompletstatus;
    }

    public void setDatafinalCompletstatus(String datafinalCompletstatus) {
        this.datafinalCompletstatus = datafinalCompletstatus;
    }

    public String getDatafinalCoursename() {
        return this.datafinalCoursename;
    }

    public void setDatafinalCoursename(String datafinalCoursename) {
        this.datafinalCoursename = datafinalCoursename;
    }

    public String getDatafinalDealernumber() {
        return this.datafinalDealernumber;
    }

    public void setDatafinalDealernumber(String datafinalDealernumber) {
        this.datafinalDealernumber = datafinalDealernumber;
    }

    public String getDatafinalFirstname() {
        return this.datafinalFirstname;
    }

    public void setDatafinalFirstname(String datafinalFirstname) {
        this.datafinalFirstname = datafinalFirstname;
    }

    public String getDatafinalLastname() {
        return this.datafinalLastname;
    }

    public void setDatafinalLastname(String datafinalLastname) {
        this.datafinalLastname = datafinalLastname;
    }

    public String getDatafinalRegisdate() {
        return this.datafinalRegisdate;
    }

    public void setDatafinalRegisdate(String datafinalRegisdate) {
        this.datafinalRegisdate = datafinalRegisdate;
    }

    public String getDatafinalRegiststatus() {
        return this.datafinalRegiststatus;
    }

    public void setDatafinalRegiststatus(String datafinalRegiststatus) {
        this.datafinalRegiststatus = datafinalRegiststatus;
    }

    public Integer getDatafinalScore() {
        return this.datafinalScore;
    }

    public void setDatafinalScore(Integer datafinalScore) {
        this.datafinalScore = datafinalScore;
    }

    public String getDatafinalTerritory() {
        return this.datafinalTerritory;
    }

    public void setDatafinalTerritory(String datafinalTerritory) {
        this.datafinalTerritory = datafinalTerritory;
    }

    public String getDatafinalUsername() {
        return this.datafinalUsername;
    }

    public void setDatafinalUsername(String datafinalUsername) {
        this.datafinalUsername = datafinalUsername;
    }

    public String getDatafinalUserstatus() {
        return this.datafinalUserstatus;
    }

    public void setDatafinalUserstatus(String datafinalUserstatus) {
        this.datafinalUserstatus = datafinalUserstatus;
    }
}
