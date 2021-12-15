package com.glacier.evo.app.sys.service.impl;

import cn.hutool.core.util.IdUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.glacier.evo.app.common.service.PageableService;
import com.glacier.evo.app.sys.service.SysLogService;
import com.glacier.evo.domain.sys.model.SysLog;
import com.glacier.component.dto.page.PageRequest;
import com.glacier.component.dto.page.PageResponse;
import com.glacier.evo.sys.mapper.SysLogMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author glacier
 * @version 1.0
 * date 2019-12-18 15:29
 */
@Transactional(readOnly = true)
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService , PageableService {
    private static final Logger log = LoggerFactory.getLogger(SysLogServiceImpl.class);
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public PageResponse<SysLog> findPage(PageRequest<SysLog> pageRequest) {
		return this.findPage(pageRequest, params -> this.sysLogMapper.selectList(params));
    }

    /**
     * 保存
     *
     * @param record 记录
     * @return 保存记录数
     */
    @Transactional(rollbackFor = {})
    @Override
    public int insert(SysLog record) {
        if (StringUtils.isNotEmpty(record.getId())) {
            return this.sysLogMapper.updateByPrimaryKey(record);
        }
        record.setId(IdUtil.simpleUUID());
        return this.sysLogMapper.insert(record);
    }

    /**
     * 异步调用保存
     *
     * @param record 记录
     */
    @Transactional(rollbackFor = {})
    @Async
    @Override
    public void insertAsync(SysLog record) {
        record.setId(IdUtil.simpleUUID());
        this.sysLogMapper.insert(record);
    }
}
