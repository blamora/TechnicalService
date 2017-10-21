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

import com.datecsa.presentation.businessDelegate.IBusinessDelegatorView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.sql.*;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* Use a Business Delegate to reduce coupling between presentation-tier clients and business services.
* The Business Delegate hides the underlying implementation details of the business service, such as lookup and access details of the EJB architecture.
*
* The Business Delegate acts as a client-side business abstraction; it provides an abstraction for, and thus hides,
* the implementation of the business services. Using a Business Delegate reduces the coupling between presentation-tier clients and
* the system's business services. Depending on the implementation strategy, the Business Delegate may shield clients from possible
* volatility in the implementation of the business service API. Potentially, this reduces the number of changes that must be made to the
* presentation-tier client code when the business service API or its underlying implementation changes.
*
* However, interface methods in the Business Delegate may still require modification if the underlying business service API changes.
* Admittedly, though, it is more likely that changes will be made to the business service rather than to the Business Delegate.
*
* Often, developers are skeptical when a design goal such as abstracting the business layer causes additional upfront work in return
* for future gains. However, using this pattern or its strategies results in only a small amount of additional upfront work and provides
* considerable benefits. The main benefit is hiding the details of the underlying service. For example, the client can become transparent
* to naming and lookup services. The Business Delegate also handles the exceptions from the business services, such as java.rmi.Remote
* exceptions, Java Messages Service (JMS) exceptions and so on. The Business Delegate may intercept such service level exceptions and
* generate application level exceptions instead. Application level exceptions are easier to handle by the clients, and may be user friendly.
* The Business Delegate may also transparently perform any retry or recovery operations necessary in the event of a service failure without
* exposing the client to the problem until it is determined that the problem is not resolvable. These gains present a compelling reason to
* use the pattern.
*
* Another benefit is that the delegate may cache results and references to remote business services. Caching can significantly improve performance,
* because it limits unnecessary and potentially costly round trips over the network.
*
* A Business Delegate uses a component called the Lookup Service. The Lookup Service is responsible for hiding the underlying implementation
* details of the business service lookup code. The Lookup Service may be written as part of the Delegate, but we recommend that it be
* implemented as a separate component, as outlined in the Service Locator pattern (See "Service Locator" on page 368.)
*
* When the Business Delegate is used with a Session Facade, typically there is a one-to-one relationship between the two.
* This one-to-one relationship exists because logic that might have been encapsulated in a Business Delegate relating to its interaction
* with multiple business services (creating a one-to-many relationship) will often be factored back into a Session Facade.
*
* Finally, it should be noted that this pattern could be used to reduce coupling between other tiers, not simply the presentation and the
* business tiers.
*
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("BusinessDelegatorView")
public class BusinessDelegatorView implements IBusinessDelegatorView {
    private static final Logger log = LoggerFactory.getLogger(BusinessDelegatorView.class);
    @Autowired
    private ICourseLogic courseLogic;
    @Autowired
    private IDatafinalLogic datafinalLogic;
    @Autowired
    private IDataoriginLogic dataoriginLogic;
    @Autowired
    private IThirdLogic thirdLogic;

    public List<Course> getCourse() throws Exception {
        return courseLogic.getCourse();
    }

    public void saveCourse(Course entity) throws Exception {
        courseLogic.saveCourse(entity);
    }

    public void deleteCourse(Course entity) throws Exception {
        courseLogic.deleteCourse(entity);
    }

    public void updateCourse(Course entity) throws Exception {
        courseLogic.updateCourse(entity);
    }

    public Course getCourse(Integer courseId) throws Exception {
        Course course = null;

        try {
            course = courseLogic.getCourse(courseId);
        } catch (Exception e) {
            throw e;
        }

        return course;
    }

    public List<Course> findByCriteriaInCourse(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return courseLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Course> findPageCourse(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return courseLogic.findPageCourse(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberCourse() throws Exception {
        return courseLogic.findTotalNumberCourse();
    }

    public List<CourseDTO> getDataCourse() throws Exception {
        return courseLogic.getDataCourse();
    }

    public void validateCourse(Course course) throws Exception {
        courseLogic.validateCourse(course);
    }

    public List<Datafinal> getDatafinal() throws Exception {
        return datafinalLogic.getDatafinal();
    }

    public void saveDatafinal(Datafinal entity) throws Exception {
        datafinalLogic.saveDatafinal(entity);
    }

    public void deleteDatafinal(Datafinal entity) throws Exception {
        datafinalLogic.deleteDatafinal(entity);
    }

    public void updateDatafinal(Datafinal entity) throws Exception {
        datafinalLogic.updateDatafinal(entity);
    }

    public Datafinal getDatafinal(Integer datafinalId)
        throws Exception {
        Datafinal datafinal = null;

        try {
            datafinal = datafinalLogic.getDatafinal(datafinalId);
        } catch (Exception e) {
            throw e;
        }

        return datafinal;
    }

    public List<Datafinal> findByCriteriaInDatafinal(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return datafinalLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Datafinal> findPageDatafinal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return datafinalLogic.findPageDatafinal(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberDatafinal() throws Exception {
        return datafinalLogic.findTotalNumberDatafinal();
    }

    public List<DatafinalDTO> getDataDatafinal() throws Exception {
        return datafinalLogic.getDataDatafinal();
    }

    public void validateDatafinal(Datafinal datafinal)
        throws Exception {
        datafinalLogic.validateDatafinal(datafinal);
    }

    public List<Dataorigin> getDataorigin() throws Exception {
        return dataoriginLogic.getDataorigin();
    }

    public void saveDataorigin(Dataorigin entity) throws Exception {
        dataoriginLogic.saveDataorigin(entity);
    }

    public void deleteDataorigin(Dataorigin entity) throws Exception {
        dataoriginLogic.deleteDataorigin(entity);
    }

    public void updateDataorigin(Dataorigin entity) throws Exception {
        dataoriginLogic.updateDataorigin(entity);
    }

    public Dataorigin getDataorigin(Integer dataoriginId)
        throws Exception {
        Dataorigin dataorigin = null;

        try {
            dataorigin = dataoriginLogic.getDataorigin(dataoriginId);
        } catch (Exception e) {
            throw e;
        }

        return dataorigin;
    }

    public List<Dataorigin> findByCriteriaInDataorigin(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return dataoriginLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Dataorigin> findPageDataorigin(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return dataoriginLogic.findPageDataorigin(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberDataorigin() throws Exception {
        return dataoriginLogic.findTotalNumberDataorigin();
    }

    public List<DataoriginDTO> getDataDataorigin() throws Exception {
        return dataoriginLogic.getDataDataorigin();
    }

    public void validateDataorigin(Dataorigin dataorigin)
        throws Exception {
        dataoriginLogic.validateDataorigin(dataorigin);
    }

    public List<Third> getThird() throws Exception {
        return thirdLogic.getThird();
    }

    public void saveThird(Third entity) throws Exception {
        thirdLogic.saveThird(entity);
    }

    public void deleteThird(Third entity) throws Exception {
        thirdLogic.deleteThird(entity);
    }

    public void updateThird(Third entity) throws Exception {
        thirdLogic.updateThird(entity);
    }

    public Third getThird(Integer thirdId) throws Exception {
        Third third = null;

        try {
            third = thirdLogic.getThird(thirdId);
        } catch (Exception e) {
            throw e;
        }

        return third;
    }

    public List<Third> findByCriteriaInThird(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return thirdLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Third> findPageThird(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return thirdLogic.findPageThird(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberThird() throws Exception {
        return thirdLogic.findTotalNumberThird();
    }

    public List<ThirdDTO> getDataThird() throws Exception {
        return thirdLogic.getDataThird();
    }

    public void validateThird(Third third) throws Exception {
        thirdLogic.validateThird(third);
    }
}
