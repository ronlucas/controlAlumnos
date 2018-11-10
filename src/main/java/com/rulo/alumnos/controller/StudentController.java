package com.rulo.alumnos.controller;

import com.rulo.alumnos.entity.user.User;
import com.rulo.alumnos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rulo.alumnos.service.AlumnoService;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping(value = "/student")
public class StudentController {

	private AlumnoService alumnoService;

    private UserService userService;

    @Autowired
	public StudentController(AlumnoService alumnoService, UserService userService) {
		this.userService = userService;
        this.alumnoService = alumnoService;
	}

	@RequestMapping(method=RequestMethod.GET, value = "/")
	public String alumnos() {
		//TODO devolver una pagina en serio
		return "alumnos";
	}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName",
                "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage", "Content Available Only for Students");
        modelAndView.setViewName("student/home");
        return modelAndView;
    }
}
