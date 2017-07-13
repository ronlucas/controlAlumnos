package com.rulo.alumnos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rulo.alumnos.service.AlumnoService;

@Controller
public class AlumnoController {

	private Logger log = LoggerFactory.getLogger(AlumnoController.class);

	private AlumnoService alumnoService;

	@Autowired
	public AlumnoController(AlumnoService alumnoService) {
		this.alumnoService = alumnoService;
	}

}
