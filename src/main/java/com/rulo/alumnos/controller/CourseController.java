package com.rulo.alumnos.controller;

import com.rulo.alumnos.entity.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CourseController {

    public List<Course> getCourses(){
    return null;
    }

    public Course getCourse(Long id){
    return null;
    }

    public void insertCourse(Course course){

    }

    public void updateCourse(Course course){

    }
    public void deleteCourse(Long id){

    }
}
