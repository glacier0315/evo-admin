package com.glacier.evo.app.sys.service.impl;

import com.glacier.evo.app.sys.dto.user.SysUser;
import com.glacier.evo.domain.sys.model.Role;
import com.glacier.evo.domain.sys.model.User;
import com.glacier.evo.sys.mapper.RoleMapper;
import com.glacier.evo.sys.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * date 2021-08-01 09:43
 *
 * @author glacier
 * @version 1.0
 */
@Service("userdetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userMapper.selectOneByUsername(username);
		if (user == null) {
		    throw new UsernameNotFoundException("用户名或者密码不正确");
		}
		return SysUser.SysUserBuilder.aSysUser()
				.id(user.getId())
				.username(user.getUsername())
				.password(user.getPassword())
				.roles(roleMapper.findByUserId(user.getId())
						.stream()
						.map(Role::getCode)
						.collect(Collectors.toList()))
				.enabled(true)
				.accountNonExpired(true)
				.accountNonLocked(true)
				.credentialsNonExpired(true)
				.build();
	}
}
