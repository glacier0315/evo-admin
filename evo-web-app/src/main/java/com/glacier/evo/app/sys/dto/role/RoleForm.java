package com.glacier.evo.app.sys.dto.role;

import java.io.Serializable;
import java.util.List;

/**
 * 角色模型
 *
 * @author glacier
 * @version 1.0
 * date 2020-07-03 21:52
 */
public class RoleForm implements Serializable {
    private static final long serialVersionUID = -1193819369875966276L;
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
    /**
     * 菜单ID 集合
     */
    private List<String> menus;
    /**
     * 单位ID 集合
     */
    private List<String> depts;

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
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDataScope() {
		return dataScope;
	}
	
	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}
	
	public List<String> getMenus() {
        return this.menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

    public List<String> getDepts() {
        return this.depts;
    }

    public void setDepts(List<String> depts) {
        this.depts = depts;
    }
	
	@Override
	public String toString() {
		return "RoleForm{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", status='" + status + '\'' +
				", description='" + description + '\'' +
				", dataScope='" + dataScope + '\'' +
				", menus=" + menus +
				", depts=" + depts +
				'}';
	}
}
