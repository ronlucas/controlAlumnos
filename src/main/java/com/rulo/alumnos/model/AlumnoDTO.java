package com.rulo.alumnos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
public class AlumnoDTO {
	
	private Long id;
	private String apellido;
	private String nombre;
	private String dni;
	private Integer cantCursadas;
	private String carrera;
//	private List<Actividad> actividades;
//	private List<Nota> notas;
}
