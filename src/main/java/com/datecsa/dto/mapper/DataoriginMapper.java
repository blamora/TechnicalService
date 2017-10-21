package com.datecsa.dto.mapper;

import com.datecsa.model.*;
import com.datecsa.model.Dataorigin;
import com.datecsa.model.control.*;
import com.datecsa.model.dto.DataoriginDTO;

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
public class DataoriginMapper implements IDataoriginMapper {
    private static final Logger log = LoggerFactory.getLogger(DataoriginMapper.class);

    @Transactional(readOnly = true)
    public DataoriginDTO dataoriginToDataoriginDTO(Dataorigin dataorigin)
        throws Exception {
        try {
            DataoriginDTO dataoriginDTO = new DataoriginDTO();

            dataoriginDTO.setDataoriginId(dataorigin.getDataoriginId());
            dataoriginDTO.setDataoriginCompany((dataorigin.getDataoriginCompany() != null)
                ? dataorigin.getDataoriginCompany() : null);
            dataoriginDTO.setDataoriginCompletdate((dataorigin.getDataoriginCompletdate() != null)
                ? dataorigin.getDataoriginCompletdate() : null);
            dataoriginDTO.setDataoriginCompletstatus((dataorigin.getDataoriginCompletstatus() != null)
                ? dataorigin.getDataoriginCompletstatus() : null);
            dataoriginDTO.setDataoriginCoursename((dataorigin.getDataoriginCoursename() != null)
                ? dataorigin.getDataoriginCoursename() : null);
            dataoriginDTO.setDataoriginDealernumber((dataorigin.getDataoriginDealernumber() != null)
                ? dataorigin.getDataoriginDealernumber() : null);
            dataoriginDTO.setDataoriginFirstname((dataorigin.getDataoriginFirstname() != null)
                ? dataorigin.getDataoriginFirstname() : null);
            dataoriginDTO.setDataoriginLastname((dataorigin.getDataoriginLastname() != null)
                ? dataorigin.getDataoriginLastname() : null);
            dataoriginDTO.setDataoriginRegisdate((dataorigin.getDataoriginRegisdate() != null)
                ? dataorigin.getDataoriginRegisdate() : null);
            dataoriginDTO.setDataoriginRegiststatus((dataorigin.getDataoriginRegiststatus() != null)
                ? dataorigin.getDataoriginRegiststatus() : null);
            dataoriginDTO.setDataoriginScore((dataorigin.getDataoriginScore() != null)
                ? dataorigin.getDataoriginScore() : null);
            dataoriginDTO.setDataoriginTerritory((dataorigin.getDataoriginTerritory() != null)
                ? dataorigin.getDataoriginTerritory() : null);
            dataoriginDTO.setDataoriginUsername((dataorigin.getDataoriginUsername() != null)
                ? dataorigin.getDataoriginUsername() : null);
            dataoriginDTO.setDataoriginUserstatus((dataorigin.getDataoriginUserstatus() != null)
                ? dataorigin.getDataoriginUserstatus() : null);

            return dataoriginDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Dataorigin dataoriginDTOToDataorigin(DataoriginDTO dataoriginDTO)
        throws Exception {
        try {
            Dataorigin dataorigin = new Dataorigin();

            dataorigin.setDataoriginId(dataoriginDTO.getDataoriginId());
            dataorigin.setDataoriginCompany((dataoriginDTO.getDataoriginCompany() != null)
                ? dataoriginDTO.getDataoriginCompany() : null);
            dataorigin.setDataoriginCompletdate((dataoriginDTO.getDataoriginCompletdate() != null)
                ? dataoriginDTO.getDataoriginCompletdate() : null);
            dataorigin.setDataoriginCompletstatus((dataoriginDTO.getDataoriginCompletstatus() != null)
                ? dataoriginDTO.getDataoriginCompletstatus() : null);
            dataorigin.setDataoriginCoursename((dataoriginDTO.getDataoriginCoursename() != null)
                ? dataoriginDTO.getDataoriginCoursename() : null);
            dataorigin.setDataoriginDealernumber((dataoriginDTO.getDataoriginDealernumber() != null)
                ? dataoriginDTO.getDataoriginDealernumber() : null);
            dataorigin.setDataoriginFirstname((dataoriginDTO.getDataoriginFirstname() != null)
                ? dataoriginDTO.getDataoriginFirstname() : null);
            dataorigin.setDataoriginLastname((dataoriginDTO.getDataoriginLastname() != null)
                ? dataoriginDTO.getDataoriginLastname() : null);
            dataorigin.setDataoriginRegisdate((dataoriginDTO.getDataoriginRegisdate() != null)
                ? dataoriginDTO.getDataoriginRegisdate() : null);
            dataorigin.setDataoriginRegiststatus((dataoriginDTO.getDataoriginRegiststatus() != null)
                ? dataoriginDTO.getDataoriginRegiststatus() : null);
            dataorigin.setDataoriginScore((dataoriginDTO.getDataoriginScore() != null)
                ? dataoriginDTO.getDataoriginScore() : null);
            dataorigin.setDataoriginTerritory((dataoriginDTO.getDataoriginTerritory() != null)
                ? dataoriginDTO.getDataoriginTerritory() : null);
            dataorigin.setDataoriginUsername((dataoriginDTO.getDataoriginUsername() != null)
                ? dataoriginDTO.getDataoriginUsername() : null);
            dataorigin.setDataoriginUserstatus((dataoriginDTO.getDataoriginUserstatus() != null)
                ? dataoriginDTO.getDataoriginUserstatus() : null);

            return dataorigin;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<DataoriginDTO> listDataoriginToListDataoriginDTO(
        List<Dataorigin> listDataorigin) throws Exception {
        try {
            List<DataoriginDTO> dataoriginDTOs = new ArrayList<DataoriginDTO>();

            for (Dataorigin dataorigin : listDataorigin) {
                DataoriginDTO dataoriginDTO = dataoriginToDataoriginDTO(dataorigin);

                dataoriginDTOs.add(dataoriginDTO);
            }

            return dataoriginDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Dataorigin> listDataoriginDTOToListDataorigin(
        List<DataoriginDTO> listDataoriginDTO) throws Exception {
        try {
            List<Dataorigin> listDataorigin = new ArrayList<Dataorigin>();

            for (DataoriginDTO dataoriginDTO : listDataoriginDTO) {
                Dataorigin dataorigin = dataoriginDTOToDataorigin(dataoriginDTO);

                listDataorigin.add(dataorigin);
            }

            return listDataorigin;
        } catch (Exception e) {
            throw e;
        }
    }
}
