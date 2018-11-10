/**
 * 
 */
package com.rulo.alumnos.service;

import com.rulo.alumnos.entity.user.User;

/**
 * @author ronlucas
 *
 */
public interface UserService {

	public User findUserByEmail(String email);
	
	public void saveUser(User user);
}
