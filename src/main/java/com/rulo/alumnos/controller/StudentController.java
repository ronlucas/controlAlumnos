package com.rulo.alumnos.controller;

import com.rulo.alumnos.model.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rulo.alumnos.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class StudentController {

  private StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/students")
  public List<StudentDTO> getAllstudents() {
    return studentService.findAllStudents();
  }
}
