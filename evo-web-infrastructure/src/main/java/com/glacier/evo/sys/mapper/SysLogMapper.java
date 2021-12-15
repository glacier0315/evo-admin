package com.glacier.evo.sys.mapper;


import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.SysLog;

import java.util.List;

/**
 * 日志数据层
 *
 * @author glacier
 * @version 1.0
 * date 2019-08-04 21:53
 */
public interface SysLogMapper extends BaseMapper<SysLog, String> {

    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 日志集合
     */
    List<SysLog> selectList(SysLog params);
}
