package com.datecsa.presentation.backingBeans;

import com.datecsa.exceptions.*;

import com.datecsa.model.*;
import com.datecsa.model.dto.DatafinalDTO;

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
public class DatafinalView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(DatafinalView.class);
    private InputText txtDatafinalCompany;
    private InputText txtDatafinalCompletdate;
    private InputText txtDatafinalCompletstatus;
    private InputText txtDatafinalCoursename;
    private InputText txtDatafinalDealernumber;
    private InputText txtDatafinalFirstname;
    private InputText txtDatafinalLastname;
    private InputText txtDatafinalRegisdate;
    private InputText txtDatafinalRegiststatus;
    private InputText txtDatafinalScore;
    private InputText txtDatafinalTerritory;
    private InputText txtDatafinalUsername;
    private InputText txtDatafinalUserstatus;
    private InputText txtDatafinalId;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<DatafinalDTO> data;
    private DatafinalDTO selectedDatafinal;
    private Datafinal entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public DatafinalView() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedDatafinal = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedDatafinal = null;

        if (txtDatafinalCompany != null) {
            txtDatafinalCompany.setValue(null);
            txtDatafinalCompany.setDisabled(true);
        }

        if (txtDatafinalCompletdate != null) {
            txtDatafinalCompletdate.setValue(null);
            txtDatafinalCompletdate.setDisabled(true);
        }

        if (txtDatafinalCompletstatus != null) {
            txtDatafinalCompletstatus.setValue(null);
            txtDatafinalCompletstatus.setDisabled(true);
        }

        if (txtDatafinalCoursename != null) {
            txtDatafinalCoursename.setValue(null);
            txtDatafinalCoursename.setDisabled(true);
        }

        if (txtDatafinalDealernumber != null) {
            txtDatafinalDealernumber.setValue(null);
            txtDatafinalDealernumber.setDisabled(true);
        }

        if (txtDatafinalFirstname != null) {
            txtDatafinalFirstname.setValue(null);
            txtDatafinalFirstname.setDisabled(true);
        }

        if (txtDatafinalLastname != null) {
            txtDatafinalLastname.setValue(null);
            txtDatafinalLastname.setDisabled(true);
        }

        if (txtDatafinalRegisdate != null) {
            txtDatafinalRegisdate.setValue(null);
            txtDatafinalRegisdate.setDisabled(true);
        }

        if (txtDatafinalRegiststatus != null) {
            txtDatafinalRegiststatus.setValue(null);
            txtDatafinalRegiststatus.setDisabled(true);
        }

        if (txtDatafinalScore != null) {
            txtDatafinalScore.setValue(null);
            txtDatafinalScore.setDisabled(true);
        }

        if (txtDatafinalTerritory != null) {
            txtDatafinalTerritory.setValue(null);
            txtDatafinalTerritory.setDisabled(true);
        }

        if (txtDatafinalUsername != null) {
            txtDatafinalUsername.setValue(null);
            txtDatafinalUsername.setDisabled(true);
        }

        if (txtDatafinalUserstatus != null) {
            txtDatafinalUserstatus.setValue(null);
            txtDatafinalUserstatus.setDisabled(true);
        }

        if (txtDatafinalId != null) {
            txtDatafinalId.setValue(null);
            txtDatafinalId.setDisabled(false);
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
            Integer datafinalId = FacesUtils.checkInteger(txtDatafinalId);
            entity = (datafinalId != null)
                ? businessDelegatorView.getDatafinal(datafinalId) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDatafinalCompany.setDisabled(false);
            txtDatafinalCompletdate.setDisabled(false);
            txtDatafinalCompletstatus.setDisabled(false);
            txtDatafinalCoursename.setDisabled(false);
            txtDatafinalDealernumber.setDisabled(false);
            txtDatafinalFirstname.setDisabled(false);
            txtDatafinalLastname.setDisabled(false);
            txtDatafinalRegisdate.setDisabled(false);
            txtDatafinalRegiststatus.setDisabled(false);
            txtDatafinalScore.setDisabled(false);
            txtDatafinalTerritory.setDisabled(false);
            txtDatafinalUsername.setDisabled(false);
            txtDatafinalUserstatus.setDisabled(false);
            txtDatafinalId.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDatafinalCompany.setValue(entity.getDatafinalCompany());
            txtDatafinalCompany.setDisabled(false);
            txtDatafinalCompletdate.setValue(entity.getDatafinalCompletdate());
            txtDatafinalCompletdate.setDisabled(false);
            txtDatafinalCompletstatus.setValue(entity.getDatafinalCompletstatus());
            txtDatafinalCompletstatus.setDisabled(false);
            txtDatafinalCoursename.setValue(entity.getDatafinalCoursename());
            txtDatafinalCoursename.setDisabled(false);
            txtDatafinalDealernumber.setValue(entity.getDatafinalDealernumber());
            txtDatafinalDealernumber.setDisabled(false);
            txtDatafinalFirstname.setValue(entity.getDatafinalFirstname());
            txtDatafinalFirstname.setDisabled(false);
            txtDatafinalLastname.setValue(entity.getDatafinalLastname());
            txtDatafinalLastname.setDisabled(false);
            txtDatafinalRegisdate.setValue(entity.getDatafinalRegisdate());
            txtDatafinalRegisdate.setDisabled(false);
            txtDatafinalRegiststatus.setValue(entity.getDatafinalRegiststatus());
            txtDatafinalRegiststatus.setDisabled(false);
            txtDatafinalScore.setValue(entity.getDatafinalScore());
            txtDatafinalScore.setDisabled(false);
            txtDatafinalTerritory.setValue(entity.getDatafinalTerritory());
            txtDatafinalTerritory.setDisabled(false);
            txtDatafinalUsername.setValue(entity.getDatafinalUsername());
            txtDatafinalUsername.setDisabled(false);
            txtDatafinalUserstatus.setValue(entity.getDatafinalUserstatus());
            txtDatafinalUserstatus.setDisabled(false);
            txtDatafinalId.setValue(entity.getDatafinalId());
            txtDatafinalId.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedDatafinal = (DatafinalDTO) (evt.getComponent().getAttributes()
                                               .get("selectedDatafinal"));
        txtDatafinalCompany.setValue(selectedDatafinal.getDatafinalCompany());
        txtDatafinalCompany.setDisabled(false);
        txtDatafinalCompletdate.setValue(selectedDatafinal.getDatafinalCompletdate());
        txtDatafinalCompletdate.setDisabled(false);
        txtDatafinalCompletstatus.setValue(selectedDatafinal.getDatafinalCompletstatus());
        txtDatafinalCompletstatus.setDisabled(false);
        txtDatafinalCoursename.setValue(selectedDatafinal.getDatafinalCoursename());
        txtDatafinalCoursename.setDisabled(false);
        txtDatafinalDealernumber.setValue(selectedDatafinal.getDatafinalDealernumber());
        txtDatafinalDealernumber.setDisabled(false);
        txtDatafinalFirstname.setValue(selectedDatafinal.getDatafinalFirstname());
        txtDatafinalFirstname.setDisabled(false);
        txtDatafinalLastname.setValue(selectedDatafinal.getDatafinalLastname());
        txtDatafinalLastname.setDisabled(false);
        txtDatafinalRegisdate.setValue(selectedDatafinal.getDatafinalRegisdate());
        txtDatafinalRegisdate.setDisabled(false);
        txtDatafinalRegiststatus.setValue(selectedDatafinal.getDatafinalRegiststatus());
        txtDatafinalRegiststatus.setDisabled(false);
        txtDatafinalScore.setValue(selectedDatafinal.getDatafinalScore());
        txtDatafinalScore.setDisabled(false);
        txtDatafinalTerritory.setValue(selectedDatafinal.getDatafinalTerritory());
        txtDatafinalTerritory.setDisabled(false);
        txtDatafinalUsername.setValue(selectedDatafinal.getDatafinalUsername());
        txtDatafinalUsername.setDisabled(false);
        txtDatafinalUserstatus.setValue(selectedDatafinal.getDatafinalUserstatus());
        txtDatafinalUserstatus.setDisabled(false);
        txtDatafinalId.setValue(selectedDatafinal.getDatafinalId());
        txtDatafinalId.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedDatafinal == null) && (entity == null)) {
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
            entity = new Datafinal();

            Integer datafinalId = FacesUtils.checkInteger(txtDatafinalId);

            entity.setDatafinalCompany(FacesUtils.checkString(
                    txtDatafinalCompany));
            entity.setDatafinalCompletdate(FacesUtils.checkString(
                    txtDatafinalCompletdate));
            entity.setDatafinalCompletstatus(FacesUtils.checkString(
                    txtDatafinalCompletstatus));
            entity.setDatafinalCoursename(FacesUtils.checkString(
                    txtDatafinalCoursename));
            entity.setDatafinalDealernumber(FacesUtils.checkString(
                    txtDatafinalDealernumber));
            entity.setDatafinalFirstname(FacesUtils.checkString(
                    txtDatafinalFirstname));
            entity.setDatafinalId(datafinalId);
            entity.setDatafinalLastname(FacesUtils.checkString(
                    txtDatafinalLastname));
            entity.setDatafinalRegisdate(FacesUtils.checkString(
                    txtDatafinalRegisdate));
            entity.setDatafinalRegiststatus(FacesUtils.checkString(
                    txtDatafinalRegiststatus));
            entity.setDatafinalScore(FacesUtils.checkInteger(txtDatafinalScore));
            entity.setDatafinalTerritory(FacesUtils.checkString(
                    txtDatafinalTerritory));
            entity.setDatafinalUsername(FacesUtils.checkString(
                    txtDatafinalUsername));
            entity.setDatafinalUserstatus(FacesUtils.checkString(
                    txtDatafinalUserstatus));
            businessDelegatorView.saveDatafinal(entity);
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
                Integer datafinalId = new Integer(selectedDatafinal.getDatafinalId());
                entity = businessDelegatorView.getDatafinal(datafinalId);
            }

            entity.setDatafinalCompany(FacesUtils.checkString(
                    txtDatafinalCompany));
            entity.setDatafinalCompletdate(FacesUtils.checkString(
                    txtDatafinalCompletdate));
            entity.setDatafinalCompletstatus(FacesUtils.checkString(
                    txtDatafinalCompletstatus));
            entity.setDatafinalCoursename(FacesUtils.checkString(
                    txtDatafinalCoursename));
            entity.setDatafinalDealernumber(FacesUtils.checkString(
                    txtDatafinalDealernumber));
            entity.setDatafinalFirstname(FacesUtils.checkString(
                    txtDatafinalFirstname));
            entity.setDatafinalLastname(FacesUtils.checkString(
                    txtDatafinalLastname));
            entity.setDatafinalRegisdate(FacesUtils.checkString(
                    txtDatafinalRegisdate));
            entity.setDatafinalRegiststatus(FacesUtils.checkString(
                    txtDatafinalRegiststatus));
            entity.setDatafinalScore(FacesUtils.checkInteger(txtDatafinalScore));
            entity.setDatafinalTerritory(FacesUtils.checkString(
                    txtDatafinalTerritory));
            entity.setDatafinalUsername(FacesUtils.checkString(
                    txtDatafinalUsername));
            entity.setDatafinalUserstatus(FacesUtils.checkString(
                    txtDatafinalUserstatus));
            businessDelegatorView.updateDatafinal(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedDatafinal = (DatafinalDTO) (evt.getComponent()
                                                   .getAttributes()
                                                   .get("selectedDatafinal"));

            Integer datafinalId = new Integer(selectedDatafinal.getDatafinalId());
            entity = businessDelegatorView.getDatafinal(datafinalId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Integer datafinalId = FacesUtils.checkInteger(txtDatafinalId);
            entity = businessDelegatorView.getDatafinal(datafinalId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteDatafinal(entity);
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

    public String action_modifyWitDTO(String datafinalCompany,
        String datafinalCompletdate, String datafinalCompletstatus,
        String datafinalCoursename, String datafinalDealernumber,
        String datafinalFirstname, Integer datafinalId,
        String datafinalLastname, String datafinalRegisdate,
        String datafinalRegiststatus, Integer datafinalScore,
        String datafinalTerritory, String datafinalUsername,
        String datafinalUserstatus) throws Exception {
        try {
            entity.setDatafinalCompany(FacesUtils.checkString(datafinalCompany));
            entity.setDatafinalCompletdate(FacesUtils.checkString(
                    datafinalCompletdate));
            entity.setDatafinalCompletstatus(FacesUtils.checkString(
                    datafinalCompletstatus));
            entity.setDatafinalCoursename(FacesUtils.checkString(
                    datafinalCoursename));
            entity.setDatafinalDealernumber(FacesUtils.checkString(
                    datafinalDealernumber));
            entity.setDatafinalFirstname(FacesUtils.checkString(
                    datafinalFirstname));
            entity.setDatafinalLastname(FacesUtils.checkString(
                    datafinalLastname));
            entity.setDatafinalRegisdate(FacesUtils.checkString(
                    datafinalRegisdate));
            entity.setDatafinalRegiststatus(FacesUtils.checkString(
                    datafinalRegiststatus));
            entity.setDatafinalScore(FacesUtils.checkInteger(datafinalScore));
            entity.setDatafinalTerritory(FacesUtils.checkString(
                    datafinalTerritory));
            entity.setDatafinalUsername(FacesUtils.checkString(
                    datafinalUsername));
            entity.setDatafinalUserstatus(FacesUtils.checkString(
                    datafinalUserstatus));
            businessDelegatorView.updateDatafinal(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("DatafinalView").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDatafinalCompany() {
        return txtDatafinalCompany;
    }

    public void setTxtDatafinalCompany(InputText txtDatafinalCompany) {
        this.txtDatafinalCompany = txtDatafinalCompany;
    }

    public InputText getTxtDatafinalCompletdate() {
        return txtDatafinalCompletdate;
    }

    public void setTxtDatafinalCompletdate(InputText txtDatafinalCompletdate) {
        this.txtDatafinalCompletdate = txtDatafinalCompletdate;
    }

    public InputText getTxtDatafinalCompletstatus() {
        return txtDatafinalCompletstatus;
    }

    public void setTxtDatafinalCompletstatus(
        InputText txtDatafinalCompletstatus) {
        this.txtDatafinalCompletstatus = txtDatafinalCompletstatus;
    }

    public InputText getTxtDatafinalCoursename() {
        return txtDatafinalCoursename;
    }

    public void setTxtDatafinalCoursename(InputText txtDatafinalCoursename) {
        this.txtDatafinalCoursename = txtDatafinalCoursename;
    }

    public InputText getTxtDatafinalDealernumber() {
        return txtDatafinalDealernumber;
    }

    public void setTxtDatafinalDealernumber(InputText txtDatafinalDealernumber) {
        this.txtDatafinalDealernumber = txtDatafinalDealernumber;
    }

    public InputText getTxtDatafinalFirstname() {
        return txtDatafinalFirstname;
    }

    public void setTxtDatafinalFirstname(InputText txtDatafinalFirstname) {
        this.txtDatafinalFirstname = txtDatafinalFirstname;
    }

    public InputText getTxtDatafinalLastname() {
        return txtDatafinalLastname;
    }

    public void setTxtDatafinalLastname(InputText txtDatafinalLastname) {
        this.txtDatafinalLastname = txtDatafinalLastname;
    }

    public InputText getTxtDatafinalRegisdate() {
        return txtDatafinalRegisdate;
    }

    public void setTxtDatafinalRegisdate(InputText txtDatafinalRegisdate) {
        this.txtDatafinalRegisdate = txtDatafinalRegisdate;
    }

    public InputText getTxtDatafinalRegiststatus() {
        return txtDatafinalRegiststatus;
    }

    public void setTxtDatafinalRegiststatus(InputText txtDatafinalRegiststatus) {
        this.txtDatafinalRegiststatus = txtDatafinalRegiststatus;
    }

    public InputText getTxtDatafinalScore() {
        return txtDatafinalScore;
    }

    public void setTxtDatafinalScore(InputText txtDatafinalScore) {
        this.txtDatafinalScore = txtDatafinalScore;
    }

    public InputText getTxtDatafinalTerritory() {
        return txtDatafinalTerritory;
    }

    public void setTxtDatafinalTerritory(InputText txtDatafinalTerritory) {
        this.txtDatafinalTerritory = txtDatafinalTerritory;
    }

    public InputText getTxtDatafinalUsername() {
        return txtDatafinalUsername;
    }

    public void setTxtDatafinalUsername(InputText txtDatafinalUsername) {
        this.txtDatafinalUsername = txtDatafinalUsername;
    }

    public InputText getTxtDatafinalUserstatus() {
        return txtDatafinalUserstatus;
    }

    public void setTxtDatafinalUserstatus(InputText txtDatafinalUserstatus) {
        this.txtDatafinalUserstatus = txtDatafinalUserstatus;
    }

    public InputText getTxtDatafinalId() {
        return txtDatafinalId;
    }

    public void setTxtDatafinalId(InputText txtDatafinalId) {
        this.txtDatafinalId = txtDatafinalId;
    }

    public List<DatafinalDTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataDatafinal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<DatafinalDTO> datafinalDTO) {
        this.data = datafinalDTO;
    }

    public DatafinalDTO getSelectedDatafinal() {
        return selectedDatafinal;
    }

    public void setSelectedDatafinal(DatafinalDTO datafinal) {
        this.selectedDatafinal = datafinal;
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
