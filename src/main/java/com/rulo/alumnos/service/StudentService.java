package com.rulo.alumnos.service;

import com.rulo.alumnos.entity.Student;
import com.rulo.alumnos.model.StudentDTO;
import com.rulo.alumnos.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

  private StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<StudentDTO> findAllStudents() {
    List<Student> students = studentRepository.findAll();
    return students.stream().map(student -> mapDto(student)).collect(Collectors.toList());
  }

  private StudentDTO mapDto(Student student) {
    StudentDTO dto = new StudentDTO();
    dto.setCareer(student.getCarrera());
    dto.setCoursesAmount(student.getCantCursadas());
    dto.setFirstName(student.getNombre());
    dto.setLastName(student.getApellido());
    dto.setDocumentId(student.getDni());
    return dto;
  }
}
