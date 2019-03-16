/** */
package com.rulo.alumnos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rulo.alumnos.entity.user.Role;
import com.rulo.alumnos.repository.RoleRepository;

/** @author ronlucas */
@Service
public class RoleServiceImpl implements RoleService {

  private final RoleRepository roleRepository;

  @Autowired
  public RoleServiceImpl(RoleRepository roleRepository) {
    super();
    this.roleRepository = roleRepository;
  }

  /*
   * (non-Javadoc)
   *
   * @see com.rulo.alumnos.service.RoleService#findByRole(java.lang.String)
   */
  @Override
  public Role findByRole(String role) {
    return roleRepository.findByRole(role);
  }
}
