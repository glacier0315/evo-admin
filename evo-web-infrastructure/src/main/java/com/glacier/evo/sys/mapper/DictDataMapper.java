package com.glacier.evo.sys.mapper;


import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.DictData;

import java.util.List;


/**
 * 字典数据
 *
 * @author glacier
 * @version 1.0
 * date 2019-10-09 11:03
 */
public interface DictDataMapper extends BaseMapper<DictData, String> {

    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 字典数据集合
     */
    List<DictData> selectList(DictData params);
}
