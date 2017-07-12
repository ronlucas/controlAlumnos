package com.rulo.alumnos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
	@RequestMapping(value = "/")
	public String index(){
		return "Hola Mundo";
	}

}
