package com.glacier.evo.sys.mapper;


import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.User;
import com.glacier.evo.domain.sys.model.dto.user.UserIdCardQuery;
import com.glacier.evo.domain.sys.model.dto.user.UserQuery;
import com.glacier.evo.domain.sys.model.dto.user.UsernameQuery;

import java.util.List;

/**
 * 用户数据层
 *
 * @author glacier
 * @version 1.0
 * date 2019-08-04 21:53
 */
public interface UserMapper extends BaseMapper<User, String> {

    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 用户集合
     */
    List<User> selectList(UserQuery params);

    /**
     * 根据组织机构id 更新组织机构名称
     *
     * @param record 记录
     * @return 更新行数
     */
    int updateDeptByDeptId(User record);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return 用户
     */
    User selectOneByUsername(String username);

    /**
     * 更新个人信息
     *
     * @param record  记录
     * @return 更新行数
     */
    int updateProfileByPrimaryKey(User record);

    /**
     * 更新头像
     *
     * @param record 记录
     * @return 更新行数
     */
    int updateAvatarByPrimaryKey(User record);

    /**
     * 更新密码
     *
     * @param record 记录
     * @return 更新行数
     */
    int updatePasswordByPrimaryKey(User record);

    /**
     * 查询用户名是否已使用
     * id 不为空时 排除该id的角色
     *
     * @param usernameQuery 角色
     * @return 编码数量（排除指定id）
     */
    int checkUsernameExist(UsernameQuery usernameQuery);

    /**
     * 查询用户身份证号是否已使用
     * id 不为空时 排除该id的角色
     *
     * @param idCardQuery 角色
     * @return 编码数量（排除指定id）
     */
    int checkIdCardExist(UserIdCardQuery idCardQuery);
}
