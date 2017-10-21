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
public class CourseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(CourseDTO.class);
    private Integer courseGroup;
    private Integer courseId;
    private String courseName;
    private Integer courseYear;
    private String couserLanguaje;

    public Integer getCourseGroup() {
        return courseGroup;
    }

    public void setCourseGroup(Integer courseGroup) {
        this.courseGroup = courseGroup;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(Integer courseYear) {
        this.courseYear = courseYear;
    }

    public String getCouserLanguaje() {
        return couserLanguaje;
    }

    public void setCouserLanguaje(String couserLanguaje) {
        this.couserLanguaje = couserLanguaje;
    }
}
