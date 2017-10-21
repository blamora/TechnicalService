package com.datecsa.dto.mapper;

import com.datecsa.model.Datafinal;
import com.datecsa.model.dto.DatafinalDTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IDatafinalMapper {
    public DatafinalDTO datafinalToDatafinalDTO(Datafinal datafinal)
        throws Exception;

    public Datafinal datafinalDTOToDatafinal(DatafinalDTO datafinalDTO)
        throws Exception;

    public List<DatafinalDTO> listDatafinalToListDatafinalDTO(
        List<Datafinal> datafinals) throws Exception;

    public List<Datafinal> listDatafinalDTOToListDatafinal(
        List<DatafinalDTO> datafinalDTOs) throws Exception;
}
