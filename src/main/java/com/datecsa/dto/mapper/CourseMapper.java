package com.datecsa.dto.mapper;

import com.datecsa.model.*;
import com.datecsa.model.Course;
import com.datecsa.model.control.*;
import com.datecsa.model.dto.CourseDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Component
@Scope("singleton")
public class CourseMapper implements ICourseMapper {
    private static final Logger log = LoggerFactory.getLogger(CourseMapper.class);

    @Transactional(readOnly = true)
    public CourseDTO courseToCourseDTO(Course course) throws Exception {
        try {
            CourseDTO courseDTO = new CourseDTO();

            courseDTO.setCourseId(course.getCourseId());
            courseDTO.setCourseGroup((course.getCourseGroup() != null)
                ? course.getCourseGroup() : null);
            courseDTO.setCourseName((course.getCourseName() != null)
                ? course.getCourseName() : null);
            courseDTO.setCourseYear((course.getCourseYear() != null)
                ? course.getCourseYear() : null);
            courseDTO.setCouserLanguaje((course.getCouserLanguaje() != null)
                ? course.getCouserLanguaje() : null);

            return courseDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Course courseDTOToCourse(CourseDTO courseDTO)
        throws Exception {
        try {
            Course course = new Course();

            course.setCourseId(courseDTO.getCourseId());
            course.setCourseGroup((courseDTO.getCourseGroup() != null)
                ? courseDTO.getCourseGroup() : null);
            course.setCourseName((courseDTO.getCourseName() != null)
                ? courseDTO.getCourseName() : null);
            course.setCourseYear((courseDTO.getCourseYear() != null)
                ? courseDTO.getCourseYear() : null);
            course.setCouserLanguaje((courseDTO.getCouserLanguaje() != null)
                ? courseDTO.getCouserLanguaje() : null);

            return course;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<CourseDTO> listCourseToListCourseDTO(List<Course> listCourse)
        throws Exception {
        try {
            List<CourseDTO> courseDTOs = new ArrayList<CourseDTO>();

            for (Course course : listCourse) {
                CourseDTO courseDTO = courseToCourseDTO(course);

                courseDTOs.add(courseDTO);
            }

            return courseDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Course> listCourseDTOToListCourse(List<CourseDTO> listCourseDTO)
        throws Exception {
        try {
            List<Course> listCourse = new ArrayList<Course>();

            for (CourseDTO courseDTO : listCourseDTO) {
                Course course = courseDTOToCourse(courseDTO);

                listCourse.add(course);
            }

            return listCourse;
        } catch (Exception e) {
            throw e;
        }
    }
}
