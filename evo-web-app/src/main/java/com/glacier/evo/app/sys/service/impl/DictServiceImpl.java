package com.glacier.evo.app.sys.service.impl;

import com.glacier.component.model.TreeBuildFactory;
import com.glacier.evo.app.sys.convert.DictConvert;
import com.glacier.evo.app.sys.dto.dict.DictVo;
import com.glacier.evo.app.sys.service.DictService;
import com.glacier.evo.domain.sys.model.Dict;
import com.glacier.evo.sys.mapper.DictMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 字典业务类
 *
 * @author glacier
 * @version 1.0
 * date 2019-12-01 21:36
 */
@Transactional(readOnly = true)
@Service("dictService")
public class DictServiceImpl implements DictService {
	private static final Logger log = LoggerFactory.getLogger(DictServiceImpl.class);
	@Autowired
	private DictConvert dictConvert;
	@Autowired
	private DictMapper dictMapper;
	
	@Transactional(rollbackFor = {})
	@Override
	public int save(Dict record) {
		if (record.isNewRecord()) {
			record.preInsert();
			return this.dictMapper.insert(record);
		}
		record.preUpdate();
		return this.dictMapper.updateByPrimaryKey(record);
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
		return this.dictMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<DictVo> findDictTree() {
		return TreeBuildFactory.buildMenuTree(
				this.dictConvert.toDictVo(
						this.dictMapper.selectAll()));
	}
}
