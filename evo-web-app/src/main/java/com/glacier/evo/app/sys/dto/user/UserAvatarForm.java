package com.glacier.evo.app.sys.dto.user;

import java.io.Serializable;

/**
 * 用户头像修改封装类
 *
 * @author glacier
 * @version 1.0
 * date 2020-07-23 10:31
 */
public class UserAvatarForm implements Serializable {

    private static final long serialVersionUID = -7808828383978219364L;
	/**
	 * 主键
	 */
	private String id;
    /**
     * 头像地址
     */
    private String avatar;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserAvatarForm{" +
                "avatar='" + this.avatar + '\'' +
                ", id='" + this.id + '\'' +
                '}';
    }
}
