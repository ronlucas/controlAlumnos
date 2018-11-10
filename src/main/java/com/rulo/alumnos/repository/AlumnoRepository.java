package com.rulo.alumnos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rulo.alumnos.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

	List<Alumno> findAll();
	
	
}
