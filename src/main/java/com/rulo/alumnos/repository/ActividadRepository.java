package com.rulo.alumnos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rulo.alumnos.entity.Actividad;

public interface ActividadRepository extends CrudRepository<Actividad, Long> {

	List<Actividad> findAll();
}
