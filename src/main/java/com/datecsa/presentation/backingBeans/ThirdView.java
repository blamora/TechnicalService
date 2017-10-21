package com.datecsa.presentation.backingBeans;

import com.datecsa.exceptions.*;

import com.datecsa.model.*;
import com.datecsa.model.dto.ThirdDTO;

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
public class ThirdView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(ThirdView.class);
    private InputText txtThirdCity;
    private InputText txtThirdPosition;
    private InputText txtThirdState;
    private InputText txtThirdUsername;
    private InputText txtThirdId;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<ThirdDTO> data;
    private ThirdDTO selectedThird;
    private Third entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public ThirdView() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedThird = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedThird = null;

        if (txtThirdCity != null) {
            txtThirdCity.setValue(null);
            txtThirdCity.setDisabled(true);
        }

        if (txtThirdPosition != null) {
            txtThirdPosition.setValue(null);
            txtThirdPosition.setDisabled(true);
        }

        if (txtThirdState != null) {
            txtThirdState.setValue(null);
            txtThirdState.setDisabled(true);
        }

        if (txtThirdUsername != null) {
            txtThirdUsername.setValue(null);
            txtThirdUsername.setDisabled(true);
        }

        if (txtThirdId != null) {
            txtThirdId.setValue(null);
            txtThirdId.setDisabled(false);
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
            Integer thirdId = FacesUtils.checkInteger(txtThirdId);
            entity = (thirdId != null)
                ? businessDelegatorView.getThird(thirdId) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtThirdCity.setDisabled(false);
            txtThirdPosition.setDisabled(false);
            txtThirdState.setDisabled(false);
            txtThirdUsername.setDisabled(false);
            txtThirdId.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtThirdCity.setValue(entity.getThirdCity());
            txtThirdCity.setDisabled(false);
            txtThirdPosition.setValue(entity.getThirdPosition());
            txtThirdPosition.setDisabled(false);
            txtThirdState.setValue(entity.getThirdState());
            txtThirdState.setDisabled(false);
            txtThirdUsername.setValue(entity.getThirdUsername());
            txtThirdUsername.setDisabled(false);
            txtThirdId.setValue(entity.getThirdId());
            txtThirdId.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedThird = (ThirdDTO) (evt.getComponent().getAttributes()
                                       .get("selectedThird"));
        txtThirdCity.setValue(selectedThird.getThirdCity());
        txtThirdCity.setDisabled(false);
        txtThirdPosition.setValue(selectedThird.getThirdPosition());
        txtThirdPosition.setDisabled(false);
        txtThirdState.setValue(selectedThird.getThirdState());
        txtThirdState.setDisabled(false);
        txtThirdUsername.setValue(selectedThird.getThirdUsername());
        txtThirdUsername.setDisabled(false);
        txtThirdId.setValue(selectedThird.getThirdId());
        txtThirdId.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedThird == null) && (entity == null)) {
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
            entity = new Third();

            Integer thirdId = FacesUtils.checkInteger(txtThirdId);

            entity.setThirdCity(FacesUtils.checkString(txtThirdCity));
            entity.setThirdId(thirdId);
            entity.setThirdPosition(FacesUtils.checkString(txtThirdPosition));
            entity.setThirdState(FacesUtils.checkInteger(txtThirdState));
            entity.setThirdUsername(FacesUtils.checkString(txtThirdUsername));
            businessDelegatorView.saveThird(entity);
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
                Integer thirdId = new Integer(selectedThird.getThirdId());
                entity = businessDelegatorView.getThird(thirdId);
            }

            entity.setThirdCity(FacesUtils.checkString(txtThirdCity));
            entity.setThirdPosition(FacesUtils.checkString(txtThirdPosition));
            entity.setThirdState(FacesUtils.checkInteger(txtThirdState));
            entity.setThirdUsername(FacesUtils.checkString(txtThirdUsername));
            businessDelegatorView.updateThird(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedThird = (ThirdDTO) (evt.getComponent().getAttributes()
                                           .get("selectedThird"));

            Integer thirdId = new Integer(selectedThird.getThirdId());
            entity = businessDelegatorView.getThird(thirdId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Integer thirdId = FacesUtils.checkInteger(txtThirdId);
            entity = businessDelegatorView.getThird(thirdId);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteThird(entity);
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

    public String action_modifyWitDTO(String thirdCity, Integer thirdId,
        String thirdPosition, Integer thirdState, String thirdUsername)
        throws Exception {
        try {
            entity.setThirdCity(FacesUtils.checkString(thirdCity));
            entity.setThirdPosition(FacesUtils.checkString(thirdPosition));
            entity.setThirdState(FacesUtils.checkInteger(thirdState));
            entity.setThirdUsername(FacesUtils.checkString(thirdUsername));
            businessDelegatorView.updateThird(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("ThirdView").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtThirdCity() {
        return txtThirdCity;
    }

    public void setTxtThirdCity(InputText txtThirdCity) {
        this.txtThirdCity = txtThirdCity;
    }

    public InputText getTxtThirdPosition() {
        return txtThirdPosition;
    }

    public void setTxtThirdPosition(InputText txtThirdPosition) {
        this.txtThirdPosition = txtThirdPosition;
    }

    public InputText getTxtThirdState() {
        return txtThirdState;
    }

    public void setTxtThirdState(InputText txtThirdState) {
        this.txtThirdState = txtThirdState;
    }

    public InputText getTxtThirdUsername() {
        return txtThirdUsername;
    }

    public void setTxtThirdUsername(InputText txtThirdUsername) {
        this.txtThirdUsername = txtThirdUsername;
    }

    public InputText getTxtThirdId() {
        return txtThirdId;
    }

    public void setTxtThirdId(InputText txtThirdId) {
        this.txtThirdId = txtThirdId;
    }

    public List<ThirdDTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataThird();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<ThirdDTO> thirdDTO) {
        this.data = thirdDTO;
    }

    public ThirdDTO getSelectedThird() {
        return selectedThird;
    }

    public void setSelectedThird(ThirdDTO third) {
        this.selectedThird = third;
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
