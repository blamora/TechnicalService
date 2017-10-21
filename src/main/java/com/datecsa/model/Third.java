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
@Table(name = "third", schema = "public")
public class Third implements java.io.Serializable {
    @Id
    @NotNull
    private Integer thirdId;
    @NotNull
    @NotEmpty
    @Size(max = 30)
    private String thirdCity;
    @NotNull
    @NotEmpty
    @Size(max = 30)
    private String thirdPosition;
    @NotNull
    private Integer thirdState;
    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String thirdUsername;

    public Third() {
    }

    public Third(Integer thirdId, String thirdCity, String thirdPosition,
        Integer thirdState, String thirdUsername) {
        this.thirdId = thirdId;
        this.thirdCity = thirdCity;
        this.thirdPosition = thirdPosition;
        this.thirdState = thirdState;
        this.thirdUsername = thirdUsername;
    }

    public Integer getThirdId() {
        return this.thirdId;
    }

    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    public String getThirdCity() {
        return this.thirdCity;
    }

    public void setThirdCity(String thirdCity) {
        this.thirdCity = thirdCity;
    }

    public String getThirdPosition() {
        return this.thirdPosition;
    }

    public void setThirdPosition(String thirdPosition) {
        this.thirdPosition = thirdPosition;
    }

    public Integer getThirdState() {
        return this.thirdState;
    }

    public void setThirdState(Integer thirdState) {
        this.thirdState = thirdState;
    }

    public String getThirdUsername() {
        return this.thirdUsername;
    }

    public void setThirdUsername(String thirdUsername) {
        this.thirdUsername = thirdUsername;
    }
}
