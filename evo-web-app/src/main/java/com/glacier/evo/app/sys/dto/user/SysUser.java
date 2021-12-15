package com.glacier.evo.app.sys.dto.user;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

/**
 * date 2021-08-01 20:48
 *
 * @author glacier
 * @version 1.0
 */
public class SysUser implements UserDetails, CredentialsContainer {
	/**
	 * id
	 */
	private String id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 角色
	 */
	private List<String> roles;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getRoles() {
		return this.roles;
	}
	
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}
	
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}
	
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
	
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}
	
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public void eraseCredentials() {
		this.password = null;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Optional.ofNullable(this.roles)
				.orElseGet(ArrayList::new)
				.stream()
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toSet());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		SysUser that = (SysUser) o;
		return Objects.equals(this.id, that.getId()) &&
				this.username.equals(that.getUsername());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.username);
	}
	
	@Override
	public String toString() {
		return "SysUser{" +
				"id='" + id + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", roles=" + roles +
				", accountNonExpired=" + accountNonExpired +
				", accountNonLocked=" + accountNonLocked +
				", credentialsNonExpired=" + credentialsNonExpired +
				", enabled=" + enabled +
				'}';
	}
	
	
	public static final class SysUserBuilder {
		private String id;
		private String username;
		private String password;
		private List<String> roles;
		private boolean accountNonExpired;
		private boolean accountNonLocked;
		private boolean credentialsNonExpired;
		private boolean enabled;
		
		private SysUserBuilder() {
		}
		
		public static SysUserBuilder aSysUser() {
			return new SysUserBuilder();
		}
		
		public SysUserBuilder id(String id) {
			this.id = id;
			return this;
		}
		
		public SysUserBuilder username(String username) {
			this.username = username;
			return this;
		}
		
		public SysUserBuilder password(String password) {
			this.password = password;
			return this;
		}
		
		public SysUserBuilder roles(List<String> roles) {
			this.roles = roles;
			return this;
		}
		
		public SysUserBuilder accountNonExpired(boolean accountNonExpired) {
			this.accountNonExpired = accountNonExpired;
			return this;
		}
		
		public SysUserBuilder accountNonLocked(boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
			return this;
		}
		
		public SysUserBuilder credentialsNonExpired(boolean credentialsNonExpired) {
			this.credentialsNonExpired = credentialsNonExpired;
			return this;
		}
		
		public SysUserBuilder enabled(boolean enabled) {
			this.enabled = enabled;
			return this;
		}
		
		public SysUser build() {
			SysUser sysUser = new SysUser();
			sysUser.setId(id);
			sysUser.setUsername(username);
			sysUser.setPassword(password);
			sysUser.setRoles(roles);
			sysUser.setAccountNonExpired(accountNonExpired);
			sysUser.setAccountNonLocked(accountNonLocked);
			sysUser.setCredentialsNonExpired(credentialsNonExpired);
			sysUser.setEnabled(enabled);
			return sysUser;
		}
	}
}
