package com.glacier.component.dto;

import java.io.Serializable;

/**
 * date 2021-12-14 16:54
 *
 * @author glacier
 * @version 1.0
 */
public class CodeQuery implements Serializable {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 编码
	 */
	private String code;
	
	public CodeQuery(String id, String code) {
		this.id = id;
		this.code = code;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "CodeQuery{" +
				"id='" + id + '\'' +
				", code='" + code + '\'' +
				'}';
	}
}
