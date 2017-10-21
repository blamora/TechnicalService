package com.datecsa.rest.controllers;

import com.datecsa.dto.mapper.IDataoriginMapper;

import com.datecsa.model.*;
import com.datecsa.model.dto.DataoriginDTO;

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
@RequestMapping("/dataorigin")
public class DataoriginRestController {
    private static final Logger log = LoggerFactory.getLogger(DataoriginRestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private IDataoriginMapper dataoriginMapper;

    @PostMapping(value = "/saveDataorigin")
    public void saveDataorigin(@RequestBody
    DataoriginDTO dataoriginDTO) throws Exception {
        try {
            Dataorigin dataorigin = dataoriginMapper.dataoriginDTOToDataorigin(dataoriginDTO);

            businessDelegatorView.saveDataorigin(dataorigin);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteDataorigin/{dataoriginId}")
    public void deleteDataorigin(
        @PathVariable("dataoriginId")
    Integer dataoriginId) throws Exception {
        try {
            Dataorigin dataorigin = businessDelegatorView.getDataorigin(dataoriginId);

            businessDelegatorView.deleteDataorigin(dataorigin);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateDataorigin/")
    public void updateDataorigin(@RequestBody
    DataoriginDTO dataoriginDTO) throws Exception {
        try {
            Dataorigin dataorigin = dataoriginMapper.dataoriginDTOToDataorigin(dataoriginDTO);

            businessDelegatorView.updateDataorigin(dataorigin);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataDataorigin")
    public List<DataoriginDTO> getDataDataorigin() throws Exception {
        try {
            return businessDelegatorView.getDataDataorigin();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataorigin/{dataoriginId}")
    public DataoriginDTO getDataorigin(
        @PathVariable("dataoriginId")
    Integer dataoriginId) throws Exception {
        try {
            Dataorigin dataorigin = businessDelegatorView.getDataorigin(dataoriginId);

            return dataoriginMapper.dataoriginToDataoriginDTO(dataorigin);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
