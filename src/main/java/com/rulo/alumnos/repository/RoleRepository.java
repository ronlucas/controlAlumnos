/**
 * 
 */
package com.rulo.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rulo.alumnos.entity.user.Role;

/**
 * @author ronlucas
 *
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
}
