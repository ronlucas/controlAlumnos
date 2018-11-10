package com.rulo.alumnos.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "ACTIVIDAD")
public class Actividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9187546039184564336L;

	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private Integer nroActividad;
	@Column
	private boolean aprobado;
}
