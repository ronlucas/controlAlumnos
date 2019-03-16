package com.rulo.alumnos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
public class StudentDTO {

  private Long id;
  private String lastName;
  private String firstName;
  private String documentId;
  private Integer coursesAmount;
  private String career;
  //	private List<Actividad> actividades;
  //	private List<Nota> notas;
}
