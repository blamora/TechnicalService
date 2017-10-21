package com.datecsa.model.control;

import com.datecsa.model.Course;
import com.datecsa.model.dto.CourseDTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ICourseLogic {
    public List<Course> getCourse() throws Exception;

    /**
         * Save an new Course entity
         */
    public void saveCourse(Course entity) throws Exception;

    /**
         * Delete an existing Course entity
         *
         */
    public void deleteCourse(Course entity) throws Exception;

    /**
        * Update an existing Course entity
        *
        */
    public void updateCourse(Course entity) throws Exception;

    /**
         * Load an existing Course entity
         *
         */
    public Course getCourse(Integer courseId) throws Exception;

    public List<Course> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Course> findPageCourse(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberCourse() throws Exception;

    public List<CourseDTO> getDataCourse() throws Exception;

    public void validateCourse(Course course) throws Exception;
}
