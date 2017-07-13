package com.rulo.alumnos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private Logger log = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
