package com.glacier.evo.sys.mapper;


import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.Config;

import java.util.List;

/**
 * 配置 数据层
 *
 * @author glacier
 * @version 1.0
 * date 2019-08-04 21:53
 */
public interface ConfigMapper extends BaseMapper<Config, String> {

    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 配置集合
     */
    List<Config> selectList(Config params);
}
