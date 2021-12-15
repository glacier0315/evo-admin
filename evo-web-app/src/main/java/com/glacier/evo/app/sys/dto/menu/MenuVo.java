package com.glacier.evo.app.sys.dto.menu;

import com.glacier.component.dto.TreeDto;
import com.glacier.component.model.TreeData;

import java.util.List;

/**
 * 菜单显示模型
 *
 * @author glacier
 * @version 1.0
 * date 2020-08-11 21:06
 */
public class MenuVo extends TreeDto implements TreeData<MenuVo> {
    private static final long serialVersionUID = 5992007206682436283L;
	/**
	 * 端点相对路径
	 */
	private String path;
	/**
	 * 组件
	 */
	private String component;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 权限标识
	 */
	private String permission;
	/**
	 * 类型 1 目录  2 端点  3 权限标识
	 */
	private Integer type;
	/**
	 * 状态 1 正常  2 禁用
	 */
	private Integer status;
	/**
	 * 是否显示 1 显示  2 隐藏
	 */
	private Integer visible;
	/**
	 * 是否外链 1 是  2 否
	 */
	private Integer isFrame;
    /**
     * 子类
     */
    protected List<MenuVo> children;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getComponent() {
		return component;
	}
	
	public void setComponent(String component) {
		this.component = component;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getVisible() {
		return visible;
	}
	
	public void setVisible(Integer visible) {
		this.visible = visible;
	}
	
	public Integer getIsFrame() {
		return isFrame;
	}
	
	public void setIsFrame(Integer isFrame) {
		this.isFrame = isFrame;
	}
	
	@Override
    public List<MenuVo> getChildren() {
        return this.children;
    }

    @Override
    public void setChildren(List<MenuVo> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuVo{" +
                "children=" + this.children +
                ", id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", parentId='" + this.parentId + '\'' +
                ", parentName='" + this.parentName + '\'' +
                ", orderNum=" + this.orderNum +
                ", grade=" + this.grade +
                '}';
    }
}
