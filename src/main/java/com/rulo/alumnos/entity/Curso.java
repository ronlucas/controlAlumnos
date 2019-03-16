package com.rulo.alumnos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Curso implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id @GeneratedValue private Long id;

  @Column private Integer cantAlumnos;
}
