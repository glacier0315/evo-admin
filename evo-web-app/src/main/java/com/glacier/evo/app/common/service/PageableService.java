package com.glacier.evo.app.common.service;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.glacier.component.dto.page.PageRequest;
import com.glacier.component.dto.page.PageResponse;

/**
 * date 2021-12-15 10:00
 *
 * @author glacier
 * @version 1.0
 */
public interface PageableService {
	
	/**
	 * 分页查询
	 *
	 * @param pageRequest                 分页请求
	 * @param findListFunctionalInterface
	 * @param <T>
	 * @param <V>
	 * @return
	 */
	default <T, V> PageResponse<V> findPage(
			PageRequest<T> pageRequest, FindListFunctionalInterface<T, V> findListFunctionalInterface) {
		PageMethod.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
		PageInfo<V> pageInfo = PageInfo.of(findListFunctionalInterface.findList(pageRequest.getParams()));
		return new PageResponse<>(
				pageInfo.getPageNum(),
				pageInfo.getPages(),
				pageInfo.getTotal(),
				pageInfo.getList());
		
		
	}
	
}
