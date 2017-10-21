package com.datecsa.presentation.backingBeans;

import com.datecsa.exceptions.*;

import com.datecsa.model.*;
import com.datecsa.model.dto.CourseDTO;

import com.datecsa.presentation.businessDelegate.*;

import com.datecsa.utilities.*;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;

import org.primefaces.event.RowEditEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 * @author Zathura Code Generator http://zathuracode.org
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class CourseView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(CourseView.class);
    private InputText txtCourseGroup;
    private InputText txtCourseName;
    private InputText txtCourseYear;
    private InputText txtCouserLanguaje;
    private InputText txtCourseId;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<CourseDTO> data;
    private CourseDTO selectedCourse;
    private Course entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public CourseView() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedCourse = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedCourse = null;

        if (txtCourseGroup != null) {
            txtCourseGroup.setValue(null);
            txtCourseGroup.setDisabled(true);
        }

        if (txtCourseName != null) {
            txtCourseName.setValue(null);
            txtCourseName.setDisabled(true);
        }

        if (txtCourseYear != null) {
            txtCourseYear.setValue(null);
            txtCourseYear.setDisabled(true);
        }

        if (txtCouserLanguaje != null) {
            txtCouserLanguaje.setValue(null);
            txtCouserLanguaje.setDisabled(true);
        }

        if (txtCourseId != null) {
            txtCourseId.setValue(null);
            txtCourseId.setDisabled(false);
        }

        if (btnSave != null) {
            btnSave.setDisabled(true);
        }

        if (btnDelete != null) {
            btnDelete.setDisabled(true);
        }

        return "";
    }

    public void listener_txtId() {
        try {
            Integer courseId = FacesUtils.checkInteger(txtCourseId);
            entity = (courseId != null)
                ? businessDelegatorView.getCourse(courseId) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtCourseGroup.setDisabled(false);
            txtCourseName.setDisabled(false);
            txtCourseYear.setDisabled(false);
            txtCouserLanguaje.setDisabled(false);
            txtCourseId.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtCourseGroup.setValue(entity.getCourseGroup());
            txtCourseGroup.setDisabled(false);
            txtCourseName.setValue(entity.getCourseName());
            txtCourseName.setDisabled(false);
            txtCourseYear.setValue(entity.getCourseYear());
            txtCourseYear.setDisabled(false);
            txtCouserLanguaje.setValue(entity.getCouserLanguaje());
            txtCouserLanguaje.setDisabled(false);
            txtCourseId.setValue(entity.getCourseId());
            txtCourseId.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedCourse = (CourseDTO) (evt.getComponent().getAttributes()
                                         .get("selectedCourse"));
        txtCourseGroup.setValue(selectedCourse.getCourseGroup());
        txtCourseGroup.setDisabled(false);
        txtCourseName.setValue(selectedCourse.getCourseName());
        txtCourseName.setDisabled(false);
        txtCourseYear.setValue(selectedCourse.getCourseYear());
        txtCourseYear.setDisabled(false);
        txtCouserLanguaje.setValue(selectedCourse.getCouserLanguaje());
        txtCouserLanguaje.setDisabled(false);
        txtCourseId.setValue(selectedCourse.getCourseId());
        txtCourseId.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedCourse == null) && (entity == null)) {
                action_create();
            } else {
                action_modify();
            }

            data = null;
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_create() {
        try {
            entity = new Course();

            Integer courseId = FacesUtils.checkInteger(txtCourseId);

            entity.setCourseGroup(FacesUtils.checkInteger(txtCourseGroup));
            entity.setCourseId(courseId);
            entity.setCourseName(FacesUtils.checkString(txtCourseName));
            entity.setCourseYear(FacesUtils.checkInteger(txtCourseYear));
            entity.setCouserLanguaje(FacesUtils.checkString(txtCouserLanguaje));
            businessDelegatorView.saveCourse(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);
            action_clear();
        } catch (Exception e) {
            entity = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_modify() {
        try {
            if (entity == null) {
                Integer courseId = new Integer(selectedCourse.getCourseId());
                entity = businessDelegatorView.getCourse(courseId);
            }

            entity.setCourseGroup(FacesUtils.checkInteger(txtCourseGroup));
            entity.setCourseName(FacesUtils.checkString(txtCourseName));
            entity.setCourseYear(FacesUtils.checkInteger(txtCourseYear));
            entity.setCouserLanguaje(FacesUtils.checkString(txtCouserLanguaje));
            businessDelegatorView.updateCourse(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedCourse = (CourseDTO) (evt.getComponent().getAttributes()
                                             .get("selectedCourse"));

            Integer courseId = new Integer(selectedCourse.getCourseId());
            entity = businessDelegatorView.getCourse(courseId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Integer courseId = FacesUtils.checkInteger(txtCourseId);
            entity = businessDelegatorView.getCourse(courseId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteCourse(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
            action_clear();
            data = null;
        } catch (Exception e) {
            throw e;
        }
    }

    public String action_closeDialog() {
        setShowDialog(false);
        action_clear();

        return "";
    }

    public String action_modifyWitDTO(Integer courseGroup, Integer courseId,
        String courseName, Integer courseYear, String couserLanguaje)
        throws Exception {
        try {
            entity.setCourseGroup(FacesUtils.checkInteger(courseGroup));
            entity.setCourseName(FacesUtils.checkString(courseName));
            entity.setCourseYear(FacesUtils.checkInteger(courseYear));
            entity.setCouserLanguaje(FacesUtils.checkString(couserLanguaje));
            businessDelegatorView.updateCourse(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("CourseView").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtCourseGroup() {
        return txtCourseGroup;
    }

    public void setTxtCourseGroup(InputText txtCourseGroup) {
        this.txtCourseGroup = txtCourseGroup;
    }

    public InputText getTxtCourseName() {
        return txtCourseName;
    }

    public void setTxtCourseName(InputText txtCourseName) {
        this.txtCourseName = txtCourseName;
    }

    public InputText getTxtCourseYear() {
        return txtCourseYear;
    }

    public void setTxtCourseYear(InputText txtCourseYear) {
        this.txtCourseYear = txtCourseYear;
    }

    public InputText getTxtCouserLanguaje() {
        return txtCouserLanguaje;
    }

    public void setTxtCouserLanguaje(InputText txtCouserLanguaje) {
        this.txtCouserLanguaje = txtCouserLanguaje;
    }

    public InputText getTxtCourseId() {
        return txtCourseId;
    }

    public void setTxtCourseId(InputText txtCourseId) {
        this.txtCourseId = txtCourseId;
    }

    public List<CourseDTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataCourse();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<CourseDTO> courseDTO) {
        this.data = courseDTO;
    }

    public CourseDTO getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(CourseDTO course) {
        this.selectedCourse = course;
    }

    public CommandButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(CommandButton btnSave) {
        this.btnSave = btnSave;
    }

    public CommandButton getBtnModify() {
        return btnModify;
    }

    public void setBtnModify(CommandButton btnModify) {
        this.btnModify = btnModify;
    }

    public CommandButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(CommandButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public CommandButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(CommandButton btnClear) {
        this.btnClear = btnClear;
    }

    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }

    public IBusinessDelegatorView getBusinessDelegatorView() {
        return businessDelegatorView;
    }

    public void setBusinessDelegatorView(
        IBusinessDelegatorView businessDelegatorView) {
        this.businessDelegatorView = businessDelegatorView;
    }

    public boolean isShowDialog() {
        return showDialog;
    }

    public void setShowDialog(boolean showDialog) {
        this.showDialog = showDialog;
    }
}
