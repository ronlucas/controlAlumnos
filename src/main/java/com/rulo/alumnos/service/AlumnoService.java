package com.rulo.alumnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rulo.alumnos.entity.Alumno;
import com.rulo.alumnos.model.AlumnoDTO;
import com.rulo.alumnos.repository.AlumnoRepository;

@Service
public class AlumnoService {

	private AlumnoRepository alumnoRepository;

	@Autowired
	public AlumnoService(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository;
	}

	public List<AlumnoDTO> getAllAlumnos() {
		List<Alumno> alumnos = alumnoRepository.findAll();

		return null;
	}
}
