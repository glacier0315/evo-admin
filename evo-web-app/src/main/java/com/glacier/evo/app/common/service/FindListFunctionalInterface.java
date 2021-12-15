package com.glacier.evo.app.common.service;

import java.util.List;

/**
 * date 2021-12-15 10:06
 *
 * @author glacier
 * @version 1.0
 */
@FunctionalInterface
public interface FindListFunctionalInterface<T, V> {
	
	/**
	 * 查询
	 * @param params
	 * @return
	 */
	List<V> findList(T params);
}
