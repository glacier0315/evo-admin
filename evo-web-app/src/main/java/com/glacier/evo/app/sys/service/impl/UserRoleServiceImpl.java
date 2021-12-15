package com.glacier.evo.app.sys.service.impl;

import com.glacier.component.dto.One2Many;
import com.glacier.evo.app.sys.service.UserRoleService;
import com.glacier.evo.sys.mapper.UserRoleMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户角色关联关系业务层
 *
 * @author glacier
 * @version 1.0
 * date 2020-08-30 12:47
 */
@Transactional(rollbackFor = {})
@Service(value = "userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
    private static final Logger log = LoggerFactory.getLogger(UserRoleServiceImpl.class);
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int addUser(One2Many<String> roleUserDto) {
        if (roleUserDto != null
                && StringUtils.isNotBlank(roleUserDto.getParentId())
                && !roleUserDto.getChildrenIds().isEmpty()) {
            return this.userRoleMapper.insertBatchUser(roleUserDto);
        }
        return 0;
    }

    @Override
    public int deleteUser(One2Many<String> roleUserDto) {
        if (roleUserDto != null
                && StringUtils.isNotBlank(roleUserDto.getParentId())
                && !roleUserDto.getChildrenIds().isEmpty()) {
            return this.userRoleMapper.deleteBatchUser(roleUserDto);
        }
        return 0;
    }

    @Override
    public int addRole(One2Many<String> userRoleDto) {
        if (userRoleDto != null
                && StringUtils.isNotBlank(userRoleDto.getParentId())
                && !userRoleDto.getChildrenIds().isEmpty()) {
            return this.userRoleMapper.insertBatchRole(userRoleDto);
        }
        return 0;
    }

    @Override
    public int deleteRole(One2Many<String> userRoleDto) {
        if (userRoleDto != null
                && StringUtils.isNotBlank(userRoleDto.getParentId())
                && !userRoleDto.getChildrenIds().isEmpty()) {
            return this.userRoleMapper.deleteBatchRole(userRoleDto);
        }
        return 0;
    }
}
