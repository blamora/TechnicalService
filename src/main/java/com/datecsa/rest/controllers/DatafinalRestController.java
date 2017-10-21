package com.datecsa.rest.controllers;

import com.datecsa.dto.mapper.IDatafinalMapper;

import com.datecsa.model.*;
import com.datecsa.model.dto.DatafinalDTO;

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
@RequestMapping("/datafinal")
public class DatafinalRestController {
    private static final Logger log = LoggerFactory.getLogger(DatafinalRestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private IDatafinalMapper datafinalMapper;

    @PostMapping(value = "/saveDatafinal")
    public void saveDatafinal(@RequestBody
    DatafinalDTO datafinalDTO) throws Exception {
        try {
            Datafinal datafinal = datafinalMapper.datafinalDTOToDatafinal(datafinalDTO);

            businessDelegatorView.saveDatafinal(datafinal);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteDatafinal/{datafinalId}")
    public void deleteDatafinal(@PathVariable("datafinalId")
    Integer datafinalId) throws Exception {
        try {
            Datafinal datafinal = businessDelegatorView.getDatafinal(datafinalId);

            businessDelegatorView.deleteDatafinal(datafinal);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateDatafinal/")
    public void updateDatafinal(@RequestBody
    DatafinalDTO datafinalDTO) throws Exception {
        try {
            Datafinal datafinal = datafinalMapper.datafinalDTOToDatafinal(datafinalDTO);

            businessDelegatorView.updateDatafinal(datafinal);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataDatafinal")
    public List<DatafinalDTO> getDataDatafinal() throws Exception {
        try {
            return businessDelegatorView.getDataDatafinal();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDatafinal/{datafinalId}")
    public DatafinalDTO getDatafinal(
        @PathVariable("datafinalId")
    Integer datafinalId) throws Exception {
        try {
            Datafinal datafinal = businessDelegatorView.getDatafinal(datafinalId);

            return datafinalMapper.datafinalToDatafinalDTO(datafinal);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
