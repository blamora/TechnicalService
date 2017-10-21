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
@Table(name = "course", schema = "public")
public class Course implements java.io.Serializable {
    @Id
    @NotNull
    private Integer courseId;
    @NotNull
    private Integer courseGroup;
    private String courseName;
    @NotNull
    private Integer courseYear;
    private String couserLanguaje;

    public Course() {
    }

    public Course(Integer courseId, Integer courseGroup, String courseName,
        Integer courseYear, String couserLanguaje) {
        this.courseId = courseId;
        this.courseGroup = courseGroup;
        this.courseName = courseName;
        this.courseYear = courseYear;
        this.couserLanguaje = couserLanguaje;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseGroup() {
        return this.courseGroup;
    }

    public void setCourseGroup(Integer courseGroup) {
        this.courseGroup = courseGroup;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseYear() {
        return this.courseYear;
    }

    public void setCourseYear(Integer courseYear) {
        this.courseYear = courseYear;
    }

    public String getCouserLanguaje() {
        return this.couserLanguaje;
    }

    public void setCouserLanguaje(String couserLanguaje) {
        this.couserLanguaje = couserLanguaje;
    }
}
