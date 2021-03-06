/** */
package com.rulo.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rulo.alumnos.entity.user.User;

/** @author ronlucas */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
}
