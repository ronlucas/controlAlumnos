package com.rulo.alumnos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@Entity(name = "NOTA")
public class Nota implements Serializable {
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
}
