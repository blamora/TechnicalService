package com.datecsa.presentation.businessDelegate;

import com.datecsa.model.Course;
import com.datecsa.model.Datafinal;
import com.datecsa.model.Dataorigin;
import com.datecsa.model.Third;
import com.datecsa.model.control.CourseLogic;
import com.datecsa.model.control.DatafinalLogic;
import com.datecsa.model.control.DataoriginLogic;
import com.datecsa.model.control.ICourseLogic;
import com.datecsa.model.control.IDatafinalLogic;
import com.datecsa.model.control.IDataoriginLogic;
import com.datecsa.model.control.IThirdLogic;
import com.datecsa.model.control.ThirdLogic;
import com.datecsa.model.dto.CourseDTO;
import com.datecsa.model.dto.DatafinalDTO;
import com.datecsa.model.dto.DataoriginDTO;
import com.datecsa.model.dto.ThirdDTO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IBusinessDelegatorView {
    public List<Course> getCourse() throws Exception;

    public void saveCourse(Course entity) throws Exception;

    public void deleteCourse(Course entity) throws Exception;

    public void updateCourse(Course entity) throws Exception;

    public Course getCourse(Integer courseId) throws Exception;

    public List<Course> findByCriteriaInCourse(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Course> findPageCourse(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberCourse() throws Exception;

    public List<CourseDTO> getDataCourse() throws Exception;

    public void validateCourse(Course course) throws Exception;

    public List<Datafinal> getDatafinal() throws Exception;

    public void saveDatafinal(Datafinal entity) throws Exception;

    public void deleteDatafinal(Datafinal entity) throws Exception;

    public void updateDatafinal(Datafinal entity) throws Exception;

    public Datafinal getDatafinal(Integer datafinalId)
        throws Exception;

    public List<Datafinal> findByCriteriaInDatafinal(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Datafinal> findPageDatafinal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberDatafinal() throws Exception;

    public List<DatafinalDTO> getDataDatafinal() throws Exception;

    public void validateDatafinal(Datafinal datafinal)
        throws Exception;

    public List<Dataorigin> getDataorigin() throws Exception;

    public void saveDataorigin(Dataorigin entity) throws Exception;

    public void deleteDataorigin(Dataorigin entity) throws Exception;

    public void updateDataorigin(Dataorigin entity) throws Exception;

    public Dataorigin getDataorigin(Integer dataoriginId)
        throws Exception;

    public List<Dataorigin> findByCriteriaInDataorigin(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Dataorigin> findPageDataorigin(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberDataorigin() throws Exception;

    public List<DataoriginDTO> getDataDataorigin() throws Exception;

    public void validateDataorigin(Dataorigin dataorigin)
        throws Exception;

    public List<Third> getThird() throws Exception;

    public void saveThird(Third entity) throws Exception;

    public void deleteThird(Third entity) throws Exception;

    public void updateThird(Third entity) throws Exception;

    public Third getThird(Integer thirdId) throws Exception;

    public List<Third> findByCriteriaInThird(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Third> findPageThird(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberThird() throws Exception;

    public List<ThirdDTO> getDataThird() throws Exception;

    public void validateThird(Third third) throws Exception;
}
