package com.glacier.evo.app.sys.dto.user;

import java.io.Serializable;

/**
 * 用户密码重置模型
 *
 * @author glacier
 * @version 1.0
 * date 2020-08-27 16:50
 */
public class UserPasswordResetForm implements Serializable {
    private static final long serialVersionUID = -3806037954613930772L;
	/**
	 * 主键
	 */
	private String id;
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
	
	public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "UserPasswordResetForm{" +
                "newPassword='" + this.newPassword + '\'' +
                ", id='" + this.id + '\'' +
                '}';
    }
}
