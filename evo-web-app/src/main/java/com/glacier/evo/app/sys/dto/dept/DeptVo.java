package com.glacier.evo.app.sys.dto.dept;


import com.glacier.component.dto.TreeDto;
import com.glacier.component.model.TreeData;

import java.util.List;

/**
 * 组织机构显示模型
 *
 * @author glacier
 * @version 1.0
 * date 2020-08-11 21:19
 */
public class DeptVo extends TreeDto implements TreeData<DeptVo> {
    private static final long serialVersionUID = 1327312988782909939L;
	/**
	 * 单位编码
	 */
	private String code;
	/**
	 * 类型
	 */
	private Integer type;
	/**
	 * 状态
	 */
	private Integer status;
    /**
     * 子类
     */
    protected List<DeptVo> children;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
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
	
	@Override
    public List<DeptVo> getChildren() {
        return this.children;
    }

    @Override
    public void setChildren(List<DeptVo> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "DeptVo{" +
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
