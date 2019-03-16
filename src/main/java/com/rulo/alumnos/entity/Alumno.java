package com.rulo.alumnos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "ALUMNO")
public class Alumno implements Serializable {

  /** */
  private static final long serialVersionUID = -4618452935207488120L;

  @Id @GeneratedValue @Column private Long id;

  @Column private String apellido;

  @Column private String nombre;

  @Column private String dni;

  @OneToMany(mappedBy = "id")
  private List<Actividad> actividades;

  @Column private Integer cantCursadas;

  @Column private String carrera;

  @OneToMany(mappedBy = "id")
  private List<Nota> notas;
}
