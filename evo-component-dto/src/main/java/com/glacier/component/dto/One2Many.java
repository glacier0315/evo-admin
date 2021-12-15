package com.glacier.component.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * date 2021-12-14 16:45
 *
 * @author glacier
 * @version 1.0
 */
public class One2Many<T> implements Serializable {
	
	/**
	 * 父类主键
	 */
	private T parentId;
	/**
	 * 子类主键集合
	 */
	private List<T> childrenIds;
	
	public One2Many() {
	}
	
	public One2Many(T parentId, List<T> childrenIds) {
		this.parentId = parentId;
		this.childrenIds = childrenIds;
	}
	
	public T getParentId() {
		return parentId;
	}
	
	public void setParentId(T parentId) {
		this.parentId = parentId;
	}
	
	public List<T> getChildrenIds() {
		return Optional.ofNullable(childrenIds)
				.orElseGet(() -> childrenIds = new ArrayList<>(8));
	}
	
	public void setChildrenIds(List<T> childrenIds) {
		this.childrenIds = childrenIds;
	}
	
	@Override
	public String toString() {
		return "One2Many{" +
				"parentId=" + parentId +
				", childrenIds=" + childrenIds +
				'}';
	}
}
