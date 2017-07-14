package com.rulo.alumnos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5811797577965432110L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private Integer cantAlumnos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantAlumnos() {
		return cantAlumnos;
	}

	public void setCantAlumnos(Integer cantAlumnos) {
		this.cantAlumnos = cantAlumnos;
	}

}
