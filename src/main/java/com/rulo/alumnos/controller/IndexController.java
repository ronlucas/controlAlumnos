package com.rulo.alumnos.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index() {
		log.info("Enter index page");
		return "index";
	}
}
