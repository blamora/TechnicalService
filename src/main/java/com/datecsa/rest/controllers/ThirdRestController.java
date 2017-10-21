package com.datecsa.rest.controllers;

import com.datecsa.dto.mapper.IThirdMapper;

import com.datecsa.model.*;
import com.datecsa.model.dto.ThirdDTO;

import com.datecsa.presentation.businessDelegate.IBusinessDelegatorView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/third")
public class ThirdRestController {
    private static final Logger log = LoggerFactory.getLogger(ThirdRestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private IThirdMapper thirdMapper;

    @PostMapping(value = "/saveThird")
    public void saveThird(@RequestBody
    ThirdDTO thirdDTO) throws Exception {
        try {
            Third third = thirdMapper.thirdDTOToThird(thirdDTO);

            businessDelegatorView.saveThird(third);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteThird/{thirdId}")
    public void deleteThird(@PathVariable("thirdId")
    Integer thirdId) throws Exception {
        try {
            Third third = businessDelegatorView.getThird(thirdId);

            businessDelegatorView.deleteThird(third);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateThird/")
    public void updateThird(@RequestBody
    ThirdDTO thirdDTO) throws Exception {
        try {
            Third third = thirdMapper.thirdDTOToThird(thirdDTO);

            businessDelegatorView.updateThird(third);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataThird")
    public List<ThirdDTO> getDataThird() throws Exception {
        try {
            return businessDelegatorView.getDataThird();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getThird/{thirdId}")
    public ThirdDTO getThird(@PathVariable("thirdId")
    Integer thirdId) throws Exception {
        try {
            Third third = businessDelegatorView.getThird(thirdId);

            return thirdMapper.thirdToThirdDTO(third);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
