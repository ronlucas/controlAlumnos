package com.rulo.alumnos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity(name = "NOTA")
public class Nota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9219778562910564699L;

	private Long id;

	private Integer nota;

	private Date fechaExamen;

	private String instancia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Date getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

}
