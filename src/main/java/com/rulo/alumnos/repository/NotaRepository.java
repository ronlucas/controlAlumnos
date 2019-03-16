package com.rulo.alumnos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rulo.alumnos.entity.Nota;

public interface NotaRepository extends CrudRepository<Nota, Long> {

  List<Nota> findAll();
}
