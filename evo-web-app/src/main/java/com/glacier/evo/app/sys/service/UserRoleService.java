package com.glacier.evo.app.sys.service;

import com.glacier.component.dto.One2Many;

/**
 * @author glacier
 * @version 1.0
 * date 2020-08-30 12:46
 */
public interface UserRoleService {
    /**
     * 保存角色用户关系
     *
     * @param roleUserDto 角色用户关系
     * @return 保存记录数
     */
    int addUser(One2Many<String> roleUserDto);

    /**
     * 移除角色用户关系
     *
     * @param roleUserDto 角色用户关系
     * @return 删除记录数
     */
    int deleteUser(One2Many<String> roleUserDto);


    /**
     * 保存用户角色关系
     *
     * @param userRoleDto 用户角色关系
     * @return 保存记录数
     */
    int addRole(One2Many<String> userRoleDto);

    /**
     * 移除用户角色关系
     *
     * @param userRoleDto 用户角色关系
     * @return 删除记录数
     */
    int deleteRole(One2Many<String> userRoleDto);
}
