package com.glacier.evo.sys.mapper;


import com.glacier.component.dto.One2Many;
import com.glacier.evo.domain.sys.model.UserRole;

/**
 * 用户角色关联关系 数据层
 *
 * @author glacier
 * @version 1.0
 * date 2019-12-18 15:29
 */
public interface UserRoleMapper {

    /**
     * 保存角色用户关系
     *
     * @param roleUserDto 角色用户关系
     * @return 保存行数
     */
    int insertBatchUser(One2Many<String> roleUserDto);

    /**
     * 移除角色用户关系
     *
     * @param roleUserDto 角色用户关系
     * @return 保存行数
     */
    int deleteBatchUser(One2Many<String> roleUserDto);

    /**
     * 保存用户角色关系
     *
     * @param userRoleDto 用户角色关系
     * @return 保存行数
     */
    int insertBatchRole(One2Many<String> userRoleDto);

    /**
     * 移除用户角色关系
     *
     * @param userRoleDto 用户角色关系
     * @return 删除记录数
     */
    int deleteBatchRole(One2Many<String> userRoleDto);

    /**
     * 删除 用户角色关联关系
     *
     * @param userId 用户id
     * @return 删除记录数
     */
    int deleteByUserId(String userId);

    /**
     * 删除 用户角色关联关系
     *
     * @param roleId 角色id
     * @return 删除记录数
     */
    int deleteByRoleId(String roleId);

    /**
     * 保存用户角色关系
     *
     * @param record 记录
     * @return 保存记录数
     */
    int insert(UserRole record);

}
