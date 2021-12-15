package com.glacier.evo.sys.mapper;


import com.glacier.component.dto.CodeQuery;
import com.glacier.component.mapper.BaseMapper;
import com.glacier.evo.domain.sys.model.Post;
import com.glacier.evo.domain.sys.model.dto.PostQuery;

import java.util.List;

/**
 * 岗位持久层
 *
 * @author glacier
 * @version 1.0
 * date 2019-10-09 11:03
 */
public interface PostMapper extends BaseMapper<Post, String> {

    /**
     * 根据条件查询
     *
     * @param params 查询参数
     * @return 岗位集合
     */
    List<Post> selectList(PostQuery params);

    /**
     * 查询编码是否已使用
     * id 不为空时 排除该id的角色
     *
     * @param codeQuery 岗位
     * @return 编码数量（排除指定id）
     */
    int checkCodeExist(CodeQuery codeQuery);
}
