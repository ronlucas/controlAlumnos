package com.rulo.alumnos.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ALUMNO")
public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4618452935207488120L;

	@Id
	@GeneratedValue
	private Long id;

	private String apellido;

	private String nombre;

	private String dni;

	private List<Actividad> actividades;

	private Integer cantCursadas;

	private String carrera;

	private List<Nota> notas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public Integer getCantCursadas() {
		return cantCursadas;
	}

	public void setCantCursadas(Integer cantCursadas) {
		this.cantCursadas = cantCursadas;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
