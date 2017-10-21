package com.datecsa.presentation.backingBeans;

import com.datecsa.exceptions.*;

import com.datecsa.model.*;
import com.datecsa.model.dto.DataoriginDTO;

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
public class DataoriginView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(DataoriginView.class);
    private InputText txtDataoriginCompany;
    private InputText txtDataoriginCompletdate;
    private InputText txtDataoriginCompletstatus;
    private InputText txtDataoriginCoursename;
    private InputText txtDataoriginDealernumber;
    private InputText txtDataoriginFirstname;
    private InputText txtDataoriginLastname;
    private InputText txtDataoriginRegisdate;
    private InputText txtDataoriginRegiststatus;
    private InputText txtDataoriginScore;
    private InputText txtDataoriginTerritory;
    private InputText txtDataoriginUsername;
    private InputText txtDataoriginUserstatus;
    private InputText txtDataoriginId;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<DataoriginDTO> data;
    private DataoriginDTO selectedDataorigin;
    private Dataorigin entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public DataoriginView() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedDataorigin = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedDataorigin = null;

        if (txtDataoriginCompany != null) {
            txtDataoriginCompany.setValue(null);
            txtDataoriginCompany.setDisabled(true);
        }

        if (txtDataoriginCompletdate != null) {
            txtDataoriginCompletdate.setValue(null);
            txtDataoriginCompletdate.setDisabled(true);
        }

        if (txtDataoriginCompletstatus != null) {
            txtDataoriginCompletstatus.setValue(null);
            txtDataoriginCompletstatus.setDisabled(true);
        }

        if (txtDataoriginCoursename != null) {
            txtDataoriginCoursename.setValue(null);
            txtDataoriginCoursename.setDisabled(true);
        }

        if (txtDataoriginDealernumber != null) {
            txtDataoriginDealernumber.setValue(null);
            txtDataoriginDealernumber.setDisabled(true);
        }

        if (txtDataoriginFirstname != null) {
            txtDataoriginFirstname.setValue(null);
            txtDataoriginFirstname.setDisabled(true);
        }

        if (txtDataoriginLastname != null) {
            txtDataoriginLastname.setValue(null);
            txtDataoriginLastname.setDisabled(true);
        }

        if (txtDataoriginRegisdate != null) {
            txtDataoriginRegisdate.setValue(null);
            txtDataoriginRegisdate.setDisabled(true);
        }

        if (txtDataoriginRegiststatus != null) {
            txtDataoriginRegiststatus.setValue(null);
            txtDataoriginRegiststatus.setDisabled(true);
        }

        if (txtDataoriginScore != null) {
            txtDataoriginScore.setValue(null);
            txtDataoriginScore.setDisabled(true);
        }

        if (txtDataoriginTerritory != null) {
            txtDataoriginTerritory.setValue(null);
            txtDataoriginTerritory.setDisabled(true);
        }

        if (txtDataoriginUsername != null) {
            txtDataoriginUsername.setValue(null);
            txtDataoriginUsername.setDisabled(true);
        }

        if (txtDataoriginUserstatus != null) {
            txtDataoriginUserstatus.setValue(null);
            txtDataoriginUserstatus.setDisabled(true);
        }

        if (txtDataoriginId != null) {
            txtDataoriginId.setValue(null);
            txtDataoriginId.setDisabled(false);
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
            Integer dataoriginId = FacesUtils.checkInteger(txtDataoriginId);
            entity = (dataoriginId != null)
                ? businessDelegatorView.getDataorigin(dataoriginId) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDataoriginCompany.setDisabled(false);
            txtDataoriginCompletdate.setDisabled(false);
            txtDataoriginCompletstatus.setDisabled(false);
            txtDataoriginCoursename.setDisabled(false);
            txtDataoriginDealernumber.setDisabled(false);
            txtDataoriginFirstname.setDisabled(false);
            txtDataoriginLastname.setDisabled(false);
            txtDataoriginRegisdate.setDisabled(false);
            txtDataoriginRegiststatus.setDisabled(false);
            txtDataoriginScore.setDisabled(false);
            txtDataoriginTerritory.setDisabled(false);
            txtDataoriginUsername.setDisabled(false);
            txtDataoriginUserstatus.setDisabled(false);
            txtDataoriginId.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDataoriginCompany.setValue(entity.getDataoriginCompany());
            txtDataoriginCompany.setDisabled(false);
            txtDataoriginCompletdate.setValue(entity.getDataoriginCompletdate());
            txtDataoriginCompletdate.setDisabled(false);
            txtDataoriginCompletstatus.setValue(entity.getDataoriginCompletstatus());
            txtDataoriginCompletstatus.setDisabled(false);
            txtDataoriginCoursename.setValue(entity.getDataoriginCoursename());
            txtDataoriginCoursename.setDisabled(false);
            txtDataoriginDealernumber.setValue(entity.getDataoriginDealernumber());
            txtDataoriginDealernumber.setDisabled(false);
            txtDataoriginFirstname.setValue(entity.getDataoriginFirstname());
            txtDataoriginFirstname.setDisabled(false);
            txtDataoriginLastname.setValue(entity.getDataoriginLastname());
            txtDataoriginLastname.setDisabled(false);
            txtDataoriginRegisdate.setValue(entity.getDataoriginRegisdate());
            txtDataoriginRegisdate.setDisabled(false);
            txtDataoriginRegiststatus.setValue(entity.getDataoriginRegiststatus());
            txtDataoriginRegiststatus.setDisabled(false);
            txtDataoriginScore.setValue(entity.getDataoriginScore());
            txtDataoriginScore.setDisabled(false);
            txtDataoriginTerritory.setValue(entity.getDataoriginTerritory());
            txtDataoriginTerritory.setDisabled(false);
            txtDataoriginUsername.setValue(entity.getDataoriginUsername());
            txtDataoriginUsername.setDisabled(false);
            txtDataoriginUserstatus.setValue(entity.getDataoriginUserstatus());
            txtDataoriginUserstatus.setDisabled(false);
            txtDataoriginId.setValue(entity.getDataoriginId());
            txtDataoriginId.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedDataorigin = (DataoriginDTO) (evt.getComponent().getAttributes()
                                                 .get("selectedDataorigin"));
        txtDataoriginCompany.setValue(selectedDataorigin.getDataoriginCompany());
        txtDataoriginCompany.setDisabled(false);
        txtDataoriginCompletdate.setValue(selectedDataorigin.getDataoriginCompletdate());
        txtDataoriginCompletdate.setDisabled(false);
        txtDataoriginCompletstatus.setValue(selectedDataorigin.getDataoriginCompletstatus());
        txtDataoriginCompletstatus.setDisabled(false);
        txtDataoriginCoursename.setValue(selectedDataorigin.getDataoriginCoursename());
        txtDataoriginCoursename.setDisabled(false);
        txtDataoriginDealernumber.setValue(selectedDataorigin.getDataoriginDealernumber());
        txtDataoriginDealernumber.setDisabled(false);
        txtDataoriginFirstname.setValue(selectedDataorigin.getDataoriginFirstname());
        txtDataoriginFirstname.setDisabled(false);
        txtDataoriginLastname.setValue(selectedDataorigin.getDataoriginLastname());
        txtDataoriginLastname.setDisabled(false);
        txtDataoriginRegisdate.setValue(selectedDataorigin.getDataoriginRegisdate());
        txtDataoriginRegisdate.setDisabled(false);
        txtDataoriginRegiststatus.setValue(selectedDataorigin.getDataoriginRegiststatus());
        txtDataoriginRegiststatus.setDisabled(false);
        txtDataoriginScore.setValue(selectedDataorigin.getDataoriginScore());
        txtDataoriginScore.setDisabled(false);
        txtDataoriginTerritory.setValue(selectedDataorigin.getDataoriginTerritory());
        txtDataoriginTerritory.setDisabled(false);
        txtDataoriginUsername.setValue(selectedDataorigin.getDataoriginUsername());
        txtDataoriginUsername.setDisabled(false);
        txtDataoriginUserstatus.setValue(selectedDataorigin.getDataoriginUserstatus());
        txtDataoriginUserstatus.setDisabled(false);
        txtDataoriginId.setValue(selectedDataorigin.getDataoriginId());
        txtDataoriginId.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedDataorigin == null) && (entity == null)) {
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
            entity = new Dataorigin();

            Integer dataoriginId = FacesUtils.checkInteger(txtDataoriginId);

            entity.setDataoriginCompany(FacesUtils.checkString(
                    txtDataoriginCompany));
            entity.setDataoriginCompletdate(FacesUtils.checkString(
                    txtDataoriginCompletdate));
            entity.setDataoriginCompletstatus(FacesUtils.checkString(
                    txtDataoriginCompletstatus));
            entity.setDataoriginCoursename(FacesUtils.checkString(
                    txtDataoriginCoursename));
            entity.setDataoriginDealernumber(FacesUtils.checkString(
                    txtDataoriginDealernumber));
            entity.setDataoriginFirstname(FacesUtils.checkString(
                    txtDataoriginFirstname));
            entity.setDataoriginId(dataoriginId);
            entity.setDataoriginLastname(FacesUtils.checkString(
                    txtDataoriginLastname));
            entity.setDataoriginRegisdate(FacesUtils.checkString(
                    txtDataoriginRegisdate));
            entity.setDataoriginRegiststatus(FacesUtils.checkString(
                    txtDataoriginRegiststatus));
            entity.setDataoriginScore(FacesUtils.checkInteger(
                    txtDataoriginScore));
            entity.setDataoriginTerritory(FacesUtils.checkString(
                    txtDataoriginTerritory));
            entity.setDataoriginUsername(FacesUtils.checkString(
                    txtDataoriginUsername));
            entity.setDataoriginUserstatus(FacesUtils.checkString(
                    txtDataoriginUserstatus));
            businessDelegatorView.saveDataorigin(entity);
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
                Integer dataoriginId = new Integer(selectedDataorigin.getDataoriginId());
                entity = businessDelegatorView.getDataorigin(dataoriginId);
            }

            entity.setDataoriginCompany(FacesUtils.checkString(
                    txtDataoriginCompany));
            entity.setDataoriginCompletdate(FacesUtils.checkString(
                    txtDataoriginCompletdate));
            entity.setDataoriginCompletstatus(FacesUtils.checkString(
                    txtDataoriginCompletstatus));
            entity.setDataoriginCoursename(FacesUtils.checkString(
                    txtDataoriginCoursename));
            entity.setDataoriginDealernumber(FacesUtils.checkString(
                    txtDataoriginDealernumber));
            entity.setDataoriginFirstname(FacesUtils.checkString(
                    txtDataoriginFirstname));
            entity.setDataoriginLastname(FacesUtils.checkString(
                    txtDataoriginLastname));
            entity.setDataoriginRegisdate(FacesUtils.checkString(
                    txtDataoriginRegisdate));
            entity.setDataoriginRegiststatus(FacesUtils.checkString(
                    txtDataoriginRegiststatus));
            entity.setDataoriginScore(FacesUtils.checkInteger(
                    txtDataoriginScore));
            entity.setDataoriginTerritory(FacesUtils.checkString(
                    txtDataoriginTerritory));
            entity.setDataoriginUsername(FacesUtils.checkString(
                    txtDataoriginUsername));
            entity.setDataoriginUserstatus(FacesUtils.checkString(
                    txtDataoriginUserstatus));
            businessDelegatorView.updateDataorigin(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedDataorigin = (DataoriginDTO) (evt.getComponent()
                                                     .getAttributes()
                                                     .get("selectedDataorigin"));

            Integer dataoriginId = new Integer(selectedDataorigin.getDataoriginId());
            entity = businessDelegatorView.getDataorigin(dataoriginId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Integer dataoriginId = FacesUtils.checkInteger(txtDataoriginId);
            entity = businessDelegatorView.getDataorigin(dataoriginId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteDataorigin(entity);
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

    public String action_modifyWitDTO(String dataoriginCompany,
        String dataoriginCompletdate, String dataoriginCompletstatus,
        String dataoriginCoursename, String dataoriginDealernumber,
        String dataoriginFirstname, Integer dataoriginId,
        String dataoriginLastname, String dataoriginRegisdate,
        String dataoriginRegiststatus, Integer dataoriginScore,
        String dataoriginTerritory, String dataoriginUsername,
        String dataoriginUserstatus) throws Exception {
        try {
            entity.setDataoriginCompany(FacesUtils.checkString(
                    dataoriginCompany));
            entity.setDataoriginCompletdate(FacesUtils.checkString(
                    dataoriginCompletdate));
            entity.setDataoriginCompletstatus(FacesUtils.checkString(
                    dataoriginCompletstatus));
            entity.setDataoriginCoursename(FacesUtils.checkString(
                    dataoriginCoursename));
            entity.setDataoriginDealernumber(FacesUtils.checkString(
                    dataoriginDealernumber));
            entity.setDataoriginFirstname(FacesUtils.checkString(
                    dataoriginFirstname));
            entity.setDataoriginLastname(FacesUtils.checkString(
                    dataoriginLastname));
            entity.setDataoriginRegisdate(FacesUtils.checkString(
                    dataoriginRegisdate));
            entity.setDataoriginRegiststatus(FacesUtils.checkString(
                    dataoriginRegiststatus));
            entity.setDataoriginScore(FacesUtils.checkInteger(dataoriginScore));
            entity.setDataoriginTerritory(FacesUtils.checkString(
                    dataoriginTerritory));
            entity.setDataoriginUsername(FacesUtils.checkString(
                    dataoriginUsername));
            entity.setDataoriginUserstatus(FacesUtils.checkString(
                    dataoriginUserstatus));
            businessDelegatorView.updateDataorigin(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("DataoriginView").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDataoriginCompany() {
        return txtDataoriginCompany;
    }

    public void setTxtDataoriginCompany(InputText txtDataoriginCompany) {
        this.txtDataoriginCompany = txtDataoriginCompany;
    }

    public InputText getTxtDataoriginCompletdate() {
        return txtDataoriginCompletdate;
    }

    public void setTxtDataoriginCompletdate(InputText txtDataoriginCompletdate) {
        this.txtDataoriginCompletdate = txtDataoriginCompletdate;
    }

    public InputText getTxtDataoriginCompletstatus() {
        return txtDataoriginCompletstatus;
    }

    public void setTxtDataoriginCompletstatus(
        InputText txtDataoriginCompletstatus) {
        this.txtDataoriginCompletstatus = txtDataoriginCompletstatus;
    }

    public InputText getTxtDataoriginCoursename() {
        return txtDataoriginCoursename;
    }

    public void setTxtDataoriginCoursename(InputText txtDataoriginCoursename) {
        this.txtDataoriginCoursename = txtDataoriginCoursename;
    }

    public InputText getTxtDataoriginDealernumber() {
        return txtDataoriginDealernumber;
    }

    public void setTxtDataoriginDealernumber(
        InputText txtDataoriginDealernumber) {
        this.txtDataoriginDealernumber = txtDataoriginDealernumber;
    }

    public InputText getTxtDataoriginFirstname() {
        return txtDataoriginFirstname;
    }

    public void setTxtDataoriginFirstname(InputText txtDataoriginFirstname) {
        this.txtDataoriginFirstname = txtDataoriginFirstname;
    }

    public InputText getTxtDataoriginLastname() {
        return txtDataoriginLastname;
    }

    public void setTxtDataoriginLastname(InputText txtDataoriginLastname) {
        this.txtDataoriginLastname = txtDataoriginLastname;
    }

    public InputText getTxtDataoriginRegisdate() {
        return txtDataoriginRegisdate;
    }

    public void setTxtDataoriginRegisdate(InputText txtDataoriginRegisdate) {
        this.txtDataoriginRegisdate = txtDataoriginRegisdate;
    }

    public InputText getTxtDataoriginRegiststatus() {
        return txtDataoriginRegiststatus;
    }

    public void setTxtDataoriginRegiststatus(
        InputText txtDataoriginRegiststatus) {
        this.txtDataoriginRegiststatus = txtDataoriginRegiststatus;
    }

    public InputText getTxtDataoriginScore() {
        return txtDataoriginScore;
    }

    public void setTxtDataoriginScore(InputText txtDataoriginScore) {
        this.txtDataoriginScore = txtDataoriginScore;
    }

    public InputText getTxtDataoriginTerritory() {
        return txtDataoriginTerritory;
    }

    public void setTxtDataoriginTerritory(InputText txtDataoriginTerritory) {
        this.txtDataoriginTerritory = txtDataoriginTerritory;
    }

    public InputText getTxtDataoriginUsername() {
        return txtDataoriginUsername;
    }

    public void setTxtDataoriginUsername(InputText txtDataoriginUsername) {
        this.txtDataoriginUsername = txtDataoriginUsername;
    }

    public InputText getTxtDataoriginUserstatus() {
        return txtDataoriginUserstatus;
    }

    public void setTxtDataoriginUserstatus(InputText txtDataoriginUserstatus) {
        this.txtDataoriginUserstatus = txtDataoriginUserstatus;
    }

    public InputText getTxtDataoriginId() {
        return txtDataoriginId;
    }

    public void setTxtDataoriginId(InputText txtDataoriginId) {
        this.txtDataoriginId = txtDataoriginId;
    }

    public List<DataoriginDTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataDataorigin();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<DataoriginDTO> dataoriginDTO) {
        this.data = dataoriginDTO;
    }

    public DataoriginDTO getSelectedDataorigin() {
        return selectedDataorigin;
    }

    public void setSelectedDataorigin(DataoriginDTO dataorigin) {
        this.selectedDataorigin = dataorigin;
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
