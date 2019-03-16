package com.rulo.alumnos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rulo.alumnos.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

  List<Student> findAll();
}
