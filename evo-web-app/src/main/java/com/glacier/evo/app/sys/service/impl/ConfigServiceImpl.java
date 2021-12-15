package com.glacier.evo.app.sys.service.impl;

import com.glacier.component.dto.page.PageRequest;
import com.glacier.component.dto.page.PageResponse;
import com.glacier.evo.app.common.service.PageableService;
import com.glacier.evo.app.sys.service.ConfigService;
import com.glacier.evo.domain.sys.model.Config;
import com.glacier.evo.sys.mapper.ConfigMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author glacier
 * @version 1.0
 * date 2019-11-21 17:37
 */
@Transactional(readOnly = true)
@Service("configService")
public class ConfigServiceImpl implements ConfigService, PageableService {
    private static final Logger log = LoggerFactory.getLogger(ConfigServiceImpl.class);
    @Autowired
    private ConfigMapper configMapper;
    
    /**
     * 保存
     *
     * @param record 记录
     * @return 保存记录数
     */
    @Transactional(rollbackFor = {})
    @Override
    public int save(Config record) {
        if (record.isNewRecord()) {
            record.preInsert();
            return this.configMapper.insert(record);
        }
        record.preUpdate();
        return this.configMapper.updateByPrimaryKey(record);
    }

    /**
     * 根据id删除
     *
     * @param id 主键
     * @return 删除记录数
     */
    @Transactional(rollbackFor = {})
    @Override
    public int delete(String id) {
        if (id == null || id.trim().isEmpty()) {
            return 0;
        }
        return this.configMapper.deleteByPrimaryKey(id);
    }

    /**
     * 分页查找
     *
     * @param pageRequest 分页请求
     * @return 分页响应
     */
    @Override
    public PageResponse<Config> findPage(PageRequest<Config> pageRequest) {
		return this.findPage(pageRequest, params -> this.configMapper.selectList(params));
    }
}
