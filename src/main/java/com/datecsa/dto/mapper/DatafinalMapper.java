package com.datecsa.dto.mapper;

import com.datecsa.model.*;
import com.datecsa.model.Datafinal;
import com.datecsa.model.control.*;
import com.datecsa.model.dto.DatafinalDTO;

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
public class DatafinalMapper implements IDatafinalMapper {
    private static final Logger log = LoggerFactory.getLogger(DatafinalMapper.class);

    @Transactional(readOnly = true)
    public DatafinalDTO datafinalToDatafinalDTO(Datafinal datafinal)
        throws Exception {
        try {
            DatafinalDTO datafinalDTO = new DatafinalDTO();

            datafinalDTO.setDatafinalId(datafinal.getDatafinalId());
            datafinalDTO.setDatafinalCompany((datafinal.getDatafinalCompany() != null)
                ? datafinal.getDatafinalCompany() : null);
            datafinalDTO.setDatafinalCompletdate((datafinal.getDatafinalCompletdate() != null)
                ? datafinal.getDatafinalCompletdate() : null);
            datafinalDTO.setDatafinalCompletstatus((datafinal.getDatafinalCompletstatus() != null)
                ? datafinal.getDatafinalCompletstatus() : null);
            datafinalDTO.setDatafinalCoursename((datafinal.getDatafinalCoursename() != null)
                ? datafinal.getDatafinalCoursename() : null);
            datafinalDTO.setDatafinalDealernumber((datafinal.getDatafinalDealernumber() != null)
                ? datafinal.getDatafinalDealernumber() : null);
            datafinalDTO.setDatafinalFirstname((datafinal.getDatafinalFirstname() != null)
                ? datafinal.getDatafinalFirstname() : null);
            datafinalDTO.setDatafinalLastname((datafinal.getDatafinalLastname() != null)
                ? datafinal.getDatafinalLastname() : null);
            datafinalDTO.setDatafinalRegisdate((datafinal.getDatafinalRegisdate() != null)
                ? datafinal.getDatafinalRegisdate() : null);
            datafinalDTO.setDatafinalRegiststatus((datafinal.getDatafinalRegiststatus() != null)
                ? datafinal.getDatafinalRegiststatus() : null);
            datafinalDTO.setDatafinalScore((datafinal.getDatafinalScore() != null)
                ? datafinal.getDatafinalScore() : null);
            datafinalDTO.setDatafinalTerritory((datafinal.getDatafinalTerritory() != null)
                ? datafinal.getDatafinalTerritory() : null);
            datafinalDTO.setDatafinalUsername((datafinal.getDatafinalUsername() != null)
                ? datafinal.getDatafinalUsername() : null);
            datafinalDTO.setDatafinalUserstatus((datafinal.getDatafinalUserstatus() != null)
                ? datafinal.getDatafinalUserstatus() : null);

            return datafinalDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Datafinal datafinalDTOToDatafinal(DatafinalDTO datafinalDTO)
        throws Exception {
        try {
            Datafinal datafinal = new Datafinal();

            datafinal.setDatafinalId(datafinalDTO.getDatafinalId());
            datafinal.setDatafinalCompany((datafinalDTO.getDatafinalCompany() != null)
                ? datafinalDTO.getDatafinalCompany() : null);
            datafinal.setDatafinalCompletdate((datafinalDTO.getDatafinalCompletdate() != null)
                ? datafinalDTO.getDatafinalCompletdate() : null);
            datafinal.setDatafinalCompletstatus((datafinalDTO.getDatafinalCompletstatus() != null)
                ? datafinalDTO.getDatafinalCompletstatus() : null);
            datafinal.setDatafinalCoursename((datafinalDTO.getDatafinalCoursename() != null)
                ? datafinalDTO.getDatafinalCoursename() : null);
            datafinal.setDatafinalDealernumber((datafinalDTO.getDatafinalDealernumber() != null)
                ? datafinalDTO.getDatafinalDealernumber() : null);
            datafinal.setDatafinalFirstname((datafinalDTO.getDatafinalFirstname() != null)
                ? datafinalDTO.getDatafinalFirstname() : null);
            datafinal.setDatafinalLastname((datafinalDTO.getDatafinalLastname() != null)
                ? datafinalDTO.getDatafinalLastname() : null);
            datafinal.setDatafinalRegisdate((datafinalDTO.getDatafinalRegisdate() != null)
                ? datafinalDTO.getDatafinalRegisdate() : null);
            datafinal.setDatafinalRegiststatus((datafinalDTO.getDatafinalRegiststatus() != null)
                ? datafinalDTO.getDatafinalRegiststatus() : null);
            datafinal.setDatafinalScore((datafinalDTO.getDatafinalScore() != null)
                ? datafinalDTO.getDatafinalScore() : null);
            datafinal.setDatafinalTerritory((datafinalDTO.getDatafinalTerritory() != null)
                ? datafinalDTO.getDatafinalTerritory() : null);
            datafinal.setDatafinalUsername((datafinalDTO.getDatafinalUsername() != null)
                ? datafinalDTO.getDatafinalUsername() : null);
            datafinal.setDatafinalUserstatus((datafinalDTO.getDatafinalUserstatus() != null)
                ? datafinalDTO.getDatafinalUserstatus() : null);

            return datafinal;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<DatafinalDTO> listDatafinalToListDatafinalDTO(
        List<Datafinal> listDatafinal) throws Exception {
        try {
            List<DatafinalDTO> datafinalDTOs = new ArrayList<DatafinalDTO>();

            for (Datafinal datafinal : listDatafinal) {
                DatafinalDTO datafinalDTO = datafinalToDatafinalDTO(datafinal);

                datafinalDTOs.add(datafinalDTO);
            }

            return datafinalDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Datafinal> listDatafinalDTOToListDatafinal(
        List<DatafinalDTO> listDatafinalDTO) throws Exception {
        try {
            List<Datafinal> listDatafinal = new ArrayList<Datafinal>();

            for (DatafinalDTO datafinalDTO : listDatafinalDTO) {
                Datafinal datafinal = datafinalDTOToDatafinal(datafinalDTO);

                listDatafinal.add(datafinal);
            }

            return listDatafinal;
        } catch (Exception e) {
            throw e;
        }
    }
}
