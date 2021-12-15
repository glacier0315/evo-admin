package com.glacier.evo.app.sys.dto.dict;

import com.glacier.component.dto.TreeDto;
import com.glacier.component.model.TreeData;

import java.util.List;

/**
 * 字典显示模型
 *
 * @author glacier
 * @version 1.0
 * date 2020-08-11 22:03
 */
public class DictVo extends TreeDto implements TreeData<DictVo> {
    private static final long serialVersionUID = 3386109145574281760L;
	/**
	 * 字典编码
	 */
	private String code;
	/**
	 * 字典类型
	 */
	private String type;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 备注
	 */
	private String remarks;
    /**
     * 子类
     */
    protected List<DictVo> children;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
    public List<DictVo> getChildren() {
        return this.children;
    }

    @Override
    public void setChildren(List<DictVo> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "DictVo{" +
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
