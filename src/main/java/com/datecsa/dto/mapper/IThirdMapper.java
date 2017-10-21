package com.datecsa.dto.mapper;

import com.datecsa.model.Third;
import com.datecsa.model.dto.ThirdDTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IThirdMapper {
    public ThirdDTO thirdToThirdDTO(Third third) throws Exception;

    public Third thirdDTOToThird(ThirdDTO thirdDTO) throws Exception;

    public List<ThirdDTO> listThirdToListThirdDTO(List<Third> thirds)
        throws Exception;

    public List<Third> listThirdDTOToListThird(List<ThirdDTO> thirdDTOs)
        throws Exception;
}
