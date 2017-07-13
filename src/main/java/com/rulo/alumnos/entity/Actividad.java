package com.rulo.alumnos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ACTIVIDAD")
public class Actividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9187546039184564336L;

	@Id
	@GeneratedValue
	private Long id;

	private Integer nroActividad;

	private boolean aprobado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNroActividad() {
		return nroActividad;
	}

	public void setNroActividad(Integer nroActividad) {
		this.nroActividad = nroActividad;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

}
