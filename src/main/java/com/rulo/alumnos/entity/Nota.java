package com.rulo.alumnos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "NOTA")
public class Nota implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private Integer nota;

	@Column
	private Date fechaExamen;

	@Column
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
