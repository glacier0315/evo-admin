package com.glacier.evo.domain.sys.model.dto.user;

import java.io.Serializable;

/**
 * date 2021-12-14 17:24
 *
 * @author glacier
 * @version 1.0
 */
public class UsernameQuery implements Serializable {
	
	/**
	 * 主键
	 */
	private String id;
	/**
	 * username
	 */
	private String username;
	
	public UsernameQuery(String id, String username) {
		this.id = id;
		this.username = username;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
