package com.glacier.evo.app.sys.dto.user;

import java.io.Serializable;

/**
 * 用户信息修改封装类
 *
 * @author glacier
 * @version 1.0
 * date 2020-07-23 10:31
 */
public class UserProfileForm implements Serializable {

    private static final long serialVersionUID = -4572380926802939142L;
	/**
	 * 主键
	 */
	private String id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别 1=男 2=女 3 其他=保密
     */
    private Integer sex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
	
	@Override
	public String toString() {
		return "UserProfileForm{" +
				"id='" + id + '\'' +
				", nickname='" + nickname + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", sex=" + sex +
				'}';
	}
}

