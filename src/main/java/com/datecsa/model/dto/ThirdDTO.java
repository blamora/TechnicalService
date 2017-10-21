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
public class ThirdDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(ThirdDTO.class);
    private String thirdCity;
    private Integer thirdId;
    private String thirdPosition;
    private Integer thirdState;
    private String thirdUsername;

    public String getThirdCity() {
        return thirdCity;
    }

    public void setThirdCity(String thirdCity) {
        this.thirdCity = thirdCity;
    }

    public Integer getThirdId() {
        return thirdId;
    }

    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    public String getThirdPosition() {
        return thirdPosition;
    }

    public void setThirdPosition(String thirdPosition) {
        this.thirdPosition = thirdPosition;
    }

    public Integer getThirdState() {
        return thirdState;
    }

    public void setThirdState(Integer thirdState) {
        this.thirdState = thirdState;
    }

    public String getThirdUsername() {
        return thirdUsername;
    }

    public void setThirdUsername(String thirdUsername) {
        this.thirdUsername = thirdUsername;
    }
}
