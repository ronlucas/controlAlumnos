/** */
package com.rulo.alumnos.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rulo.alumnos.builder.UserFactory;
import com.rulo.alumnos.entity.user.Role;
import com.rulo.alumnos.entity.user.User;
import com.rulo.alumnos.service.RoleService;
import com.rulo.alumnos.service.UserService;

/** @author ronlucas */
@Controller
public class LoginController {

  private UserService userService;

  private RoleService roleService;

  @Autowired
  public LoginController(UserService userService, RoleService roleService) {
    super();
    this.userService = userService;
    this.roleService = roleService;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/login")
  public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("login");
    return modelAndView;
  }

  @RequestMapping(value = "/registration", method = RequestMethod.GET)
  public ModelAndView registration() {
    ModelAndView modelAndView = new ModelAndView();
    User user = new User();
    modelAndView.addObject("user", user);
    modelAndView.setViewName("registration");
    return modelAndView;
  }

  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
    ModelAndView modelAndView = new ModelAndView();
    User userExists = userService.findUserByEmail(user.getEmail());
    if (userExists != null) {
      bindingResult.rejectValue(
          "email", "error.user", "There is already a user registered with the email provided");
    }
    if (bindingResult.hasErrors()) {
      modelAndView.setViewName("registration");
    } else {
      user.setRoles(new HashSet<Role>());
      user.getRoles().add(roleService.findByRole("ADMIN"));
      userService.saveUser(user);
      modelAndView.addObject("successMessage", "User has been registered successfully");
      modelAndView.addObject("user", new User());
      modelAndView.setViewName("registration");
    }
    return modelAndView;
  }
}
