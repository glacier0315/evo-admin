package com.glacier.evo.app.sys.convert;

import com.glacier.evo.app.sys.dto.RoleDetailsDto;
import com.glacier.evo.app.sys.dto.role.RoleForm;
import com.glacier.evo.app.sys.dto.role.RoleVo;
import com.glacier.evo.domain.sys.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * date 2021-05-06 16:26
 * 角色类型转换
 *
 * @author glacier
 * @version 1.0
 */
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleConvert {
    
    /**
     * 转换
     * @param role
     * @return
     */
    RoleVo toRoleVo(Role role);
    
    /**
     * 转换
     * @param role
     * @return
     */
    List<RoleVo> toRoleVo(List<Role> role);
    
    /**
     * 转换
     * @param role
     * @return
     */
    RoleDetailsDto toRoleDetailsDto(Role role);
    
    /**
     * 转换
     * @param roles
     * @return
     */
    List<RoleDetailsDto> toRoleDetailsDtos(List<Role> roles);
    
    /**
     * 转换
     * @param roleForm
     * @return
     */
    Role map(RoleForm roleForm);
}
