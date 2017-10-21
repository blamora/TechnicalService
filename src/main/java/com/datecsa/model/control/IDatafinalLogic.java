package com.datecsa.model.control;

import com.datecsa.model.Datafinal;
import com.datecsa.model.dto.DatafinalDTO;

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
public interface IDatafinalLogic {
    public List<Datafinal> getDatafinal() throws Exception;

    /**
         * Save an new Datafinal entity
         */
    public void saveDatafinal(Datafinal entity) throws Exception;

    /**
         * Delete an existing Datafinal entity
         *
         */
    public void deleteDatafinal(Datafinal entity) throws Exception;

    /**
        * Update an existing Datafinal entity
        *
        */
    public void updateDatafinal(Datafinal entity) throws Exception;

    /**
         * Load an existing Datafinal entity
         *
         */
    public Datafinal getDatafinal(Integer datafinalId)
        throws Exception;

    public List<Datafinal> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Datafinal> findPageDatafinal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberDatafinal() throws Exception;

    public List<DatafinalDTO> getDataDatafinal() throws Exception;

    public void validateDatafinal(Datafinal datafinal)
        throws Exception;
}
