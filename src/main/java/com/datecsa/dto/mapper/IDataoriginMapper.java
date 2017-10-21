package com.datecsa.dto.mapper;

import com.datecsa.model.Dataorigin;
import com.datecsa.model.dto.DataoriginDTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IDataoriginMapper {
    public DataoriginDTO dataoriginToDataoriginDTO(Dataorigin dataorigin)
        throws Exception;

    public Dataorigin dataoriginDTOToDataorigin(DataoriginDTO dataoriginDTO)
        throws Exception;

    public List<DataoriginDTO> listDataoriginToListDataoriginDTO(
        List<Dataorigin> dataorigins) throws Exception;

    public List<Dataorigin> listDataoriginDTOToListDataorigin(
        List<DataoriginDTO> dataoriginDTOs) throws Exception;
}
