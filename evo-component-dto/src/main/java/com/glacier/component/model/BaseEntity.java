package com.glacier.component.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 基类
 *
 * @author glacier
 * @version 1.0
 * date 2020-05-18 15:59
 */
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = -3733490542838696950L;
	/**
	 * 主键
	 */
	protected String id;
	/**
	 * 自定义SQL（SQL标识，SQL内容）
	 */
	@JsonIgnore
	private Map<String, String> sqlMap;
	
	/**
	 * 是否是新记录（默认：false），调用setNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 */
	@JsonIgnore
	private boolean newRecord = false;
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 获取sqlMap
	 *
	 * @return 返回sqlMap
	 */
	public Map<String, String> getSqlMap() {
		this.sqlMap = Optional.ofNullable(this.sqlMap)
				.orElseGet(ConcurrentHashMap::new);
		return this.sqlMap;
	}
	
	/**
	 * 是否是新记录（默认：false），setNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 *
	 * @return true 新记录  false 旧记录
	 */
	public boolean isNewRecord() {
		return this.newRecord || this.getId() == null || this.getId().isEmpty();
	}
	
	
	/**
	 * 是否是新记录（默认：false），setNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 *
	 * @param newRecord 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 */
	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
	
	/**
	 * 插入之前执行方法，子类实现
	 */
	public abstract void preInsert();
	
	/**
	 * 更新之前执行方法，子类实现
	 */
	public abstract void preUpdate();
	
}