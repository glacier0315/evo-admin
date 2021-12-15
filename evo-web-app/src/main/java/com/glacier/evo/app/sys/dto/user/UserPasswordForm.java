package com.glacier.evo.app.sys.dto.user;

import java.io.Serializable;

/**
 * 用户密码修改封装类
 *
 * @author glacier
 * @version 1.0
 * date 2020-07-23 10:12
 */
public class UserPasswordForm implements Serializable {
    private static final long serialVersionUID = -3806037954613930772L;
	/**
	 * 主键
	 */
	private String id;
    /**
     * 旧密码
     */
    private String oldPassword;
    /**
     * 新密码
     */
    private String newPassword;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getOldPassword() {
        return this.oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "UserPasswordForm{" +
                "oldPassword='" + this.oldPassword + '\'' +
                ", newPassword='" + this.newPassword + '\'' +
                ", id='" + this.id + '\'' +
                '}';
    }
}
