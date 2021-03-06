package com.glacier.evo.sys.mapper;


import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.LoginLog;

import java.util.List;

/**
 * 登录日志 持久层
 *
 * @author glacier
 * @version 1.0
 * date 2019-10-09 11:03
 */
public interface LoginLogMapper extends BaseMapper<LoginLog, String> {
    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 登录日志集合
     */
    List<LoginLog> selectList(LoginLog params);
}
