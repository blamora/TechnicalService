package com.datecsa.dto.mapper;

import com.datecsa.model.*;
import com.datecsa.model.Third;
import com.datecsa.model.control.*;
import com.datecsa.model.dto.ThirdDTO;

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
public class ThirdMapper implements IThirdMapper {
    private static final Logger log = LoggerFactory.getLogger(ThirdMapper.class);

    @Transactional(readOnly = true)
    public ThirdDTO thirdToThirdDTO(Third third) throws Exception {
        try {
            ThirdDTO thirdDTO = new ThirdDTO();

            thirdDTO.setThirdId(third.getThirdId());
            thirdDTO.setThirdCity((third.getThirdCity() != null)
                ? third.getThirdCity() : null);
            thirdDTO.setThirdPosition((third.getThirdPosition() != null)
                ? third.getThirdPosition() : null);
            thirdDTO.setThirdState((third.getThirdState() != null)
                ? third.getThirdState() : null);
            thirdDTO.setThirdUsername((third.getThirdUsername() != null)
                ? third.getThirdUsername() : null);

            return thirdDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Third thirdDTOToThird(ThirdDTO thirdDTO) throws Exception {
        try {
            Third third = new Third();

            third.setThirdId(thirdDTO.getThirdId());
            third.setThirdCity((thirdDTO.getThirdCity() != null)
                ? thirdDTO.getThirdCity() : null);
            third.setThirdPosition((thirdDTO.getThirdPosition() != null)
                ? thirdDTO.getThirdPosition() : null);
            third.setThirdState((thirdDTO.getThirdState() != null)
                ? thirdDTO.getThirdState() : null);
            third.setThirdUsername((thirdDTO.getThirdUsername() != null)
                ? thirdDTO.getThirdUsername() : null);

            return third;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<ThirdDTO> listThirdToListThirdDTO(List<Third> listThird)
        throws Exception {
        try {
            List<ThirdDTO> thirdDTOs = new ArrayList<ThirdDTO>();

            for (Third third : listThird) {
                ThirdDTO thirdDTO = thirdToThirdDTO(third);

                thirdDTOs.add(thirdDTO);
            }

            return thirdDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Third> listThirdDTOToListThird(List<ThirdDTO> listThirdDTO)
        throws Exception {
        try {
            List<Third> listThird = new ArrayList<Third>();

            for (ThirdDTO thirdDTO : listThirdDTO) {
                Third third = thirdDTOToThird(thirdDTO);

                listThird.add(third);
            }

            return listThird;
        } catch (Exception e) {
            throw e;
        }
    }
}
