package com.datecsa.model.control;

import com.datecsa.model.Dataorigin;
import com.datecsa.model.dto.DataoriginDTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IDataoriginLogic {
    public List<Dataorigin> getDataorigin() throws Exception;

    /**
         * Save an new Dataorigin entity
         */
    public void saveDataorigin(Dataorigin entity) throws Exception;

    /**
         * Delete an existing Dataorigin entity
         *
         */
    public void deleteDataorigin(Dataorigin entity) throws Exception;

    /**
        * Update an existing Dataorigin entity
        *
        */
    public void updateDataorigin(Dataorigin entity) throws Exception;

    /**
         * Load an existing Dataorigin entity
         *
         */
    public Dataorigin getDataorigin(Integer dataoriginId)
        throws Exception;

    public List<Dataorigin> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Dataorigin> findPageDataorigin(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberDataorigin() throws Exception;

    public List<DataoriginDTO> getDataDataorigin() throws Exception;

    public void validateDataorigin(Dataorigin dataorigin)
        throws Exception;
}
