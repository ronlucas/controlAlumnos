/**
 * 
 */
package com.rulo.alumnos.builder;

import java.util.HashSet;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;

import com.rulo.alumnos.entity.user.Role;
import com.rulo.alumnos.entity.user.User;
import com.rulo.alumnos.service.RoleService;

/**
 * @author ronlucas
 *
 */
public class UserFactory {

	private static final String ADMIN = "ADMIN";
	private static final String USER = "USER";

	private final User user;

	private final RoleService roleService;

	@Autowired
	public UserFactory(RoleService roleService) {
		this.user = new User();
		HashSet<Role> roles = new HashSet<Role>();
		user.setRoles(roles);
		this.roleService = roleService;
	}

	public UserFactory asAdmin() {
		user.getRoles().add(roleService.findByRole(ADMIN));
		return this;
	}

	public UserFactory asUser() {
		user.getRoles().add(roleService.findByRole(USER));
		return this;
	}

	public User build() {
		return this.user;
	}

}
