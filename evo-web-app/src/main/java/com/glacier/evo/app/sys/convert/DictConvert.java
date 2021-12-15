package com.glacier.evo.app.sys.convert;

import com.glacier.evo.app.sys.dto.dict.DictVo;
import com.glacier.evo.domain.sys.model.Dict;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * date 2021-05-06 16:43
 * 字典类型转换
 *
 * @author glacier
 * @version 1.0
 */
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictConvert {
    
    /**
     * 转换
     *
     * @param dict
     * @return
     */
    DictVo toDictVo(Dict dict);
    
    /**
     * 转换
     *
     * @param dictList
     * @return
     */
    List<DictVo> toDictVo(List<Dict> dictList);
}
