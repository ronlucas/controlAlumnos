/**
 * 
 */
package com.rulo.alumnos.service;

import com.rulo.alumnos.entity.user.Role;

/**
 * @author ronlucas
 *
 */
public interface RoleService {
	Role findByRole(String role);
}
