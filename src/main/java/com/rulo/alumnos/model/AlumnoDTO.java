package com.rulo.alumnos.model;

public class AlumnoDTO {
	
	private Long id;

	private String apellido;

	private String nombre;

	private String dni;

	private Integer cantCursadas;
	
	private String carrera;

//	private List<Actividad> actividades;
	
//	private List<Nota> notas;
	
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
	
	

	
}
