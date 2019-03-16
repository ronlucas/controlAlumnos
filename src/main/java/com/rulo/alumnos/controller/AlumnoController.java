package com.rulo.alumnos.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rulo.alumnos.service.AlumnoService;

@Slf4j
@Controller
public class AlumnoController {

  private AlumnoService alumnoService;

  @Autowired
  public AlumnoController(AlumnoService alumnoService) {
    this.alumnoService = alumnoService;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/alumnos")
  public String alumnos() {
    // TODO devolver una pagina en serio
    return "alumnos";
  }
}
