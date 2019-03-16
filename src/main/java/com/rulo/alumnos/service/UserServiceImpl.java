/** */
package com.rulo.alumnos.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rulo.alumnos.entity.user.Role;
import com.rulo.alumnos.entity.user.User;
import com.rulo.alumnos.repository.RoleRepository;
import com.rulo.alumnos.repository.UserRepository;

/** @author ronlucas */
@Service("userService")
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  private final RoleRepository roleRepository;

  private final BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public UserServiceImpl(
      UserRepository userRepository,
      RoleRepository roleRepository,
      BCryptPasswordEncoder bCryptPasswordEncoder) {
    super();
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  /*
   * (non-Javadoc)
   *
   * @see com.rulo.alumnos.service.UserService#findUserByEmail(java.lang.String)
   */
  @Override
  public User findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  /*
   * (non-Javadoc)
   *
   * @see
   * com.rulo.alumnos.service.UserService#saveUser(com.rulo.alumnos.entity.user.
   * User)
   */
  @Override
  public void saveUser(User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setActive(1);
    Role userRole = roleRepository.findByRole("ADMIN");
    user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
    userRepository.save(user);
  }
}
