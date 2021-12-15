package com.glacier.evo.app.sys.dto.role;

import java.io.Serializable;

/**
 * @author glacier
 * @version 1.0
 * date 2020-08-12 11:22
 */
public class RoleVo implements Serializable {
    private static final long serialVersionUID = 643721597611972197L;
	/**
	 * 主键
	 */
	private String id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色编码
     */
    private String code;
    /**
     * 状态 1 正常  2 禁用
     */
    private String status;
    /**
     * 描述
     */
    private String description;
    /**
     * 数据权限 1 所有单位  2 所属一级单位及以下  3 所属二级单位及以下  4 所属单位部门及以下  5 自定义 6 自己
     */
    private String dataScope;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataScope() {
        return this.dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    @Override
    public String toString() {
        return "RoleVo{" +
                "name='" + this.name + '\'' +
                ", code='" + this.code + '\'' +
                ", status='" + this.status + '\'' +
                ", description='" + this.description + '\'' +
                ", dataScope='" + this.dataScope + '\'' +
                ", id='" + this.id + '\'' +
                '}';
    }
}
