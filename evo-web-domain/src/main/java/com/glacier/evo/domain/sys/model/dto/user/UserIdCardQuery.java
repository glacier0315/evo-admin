package com.glacier.evo.domain.sys.model.dto.user;

import java.io.Serializable;

/**
 * date 2021-12-14 17:25
 *
 * @author glacier
 * @version 1.0
 */
public class UserIdCardQuery implements Serializable {
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 身份证号
	 */
	private String idCard;
	
	public UserIdCardQuery(String id, String idCard) {
		this.id = id;
		this.idCard = idCard;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdCard() {
		return idCard;
	}
	
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}
