package com.datecsa.model.control;

import com.datecsa.model.Third;
import com.datecsa.model.dto.ThirdDTO;

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
public interface IThirdLogic {
    public List<Third> getThird() throws Exception;

    /**
         * Save an new Third entity
         */
    public void saveThird(Third entity) throws Exception;

    /**
         * Delete an existing Third entity
         *
         */
    public void deleteThird(Third entity) throws Exception;

    /**
        * Update an existing Third entity
        *
        */
    public void updateThird(Third entity) throws Exception;

    /**
         * Load an existing Third entity
         *
         */
    public Third getThird(Integer thirdId) throws Exception;

    public List<Third> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Third> findPageThird(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberThird() throws Exception;

    public List<ThirdDTO> getDataThird() throws Exception;

    public void validateThird(Third third) throws Exception;
}
