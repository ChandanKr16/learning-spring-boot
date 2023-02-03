package me.chandankumar.learningspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return List.of(
          new Course(1, "Java", "James Gosling"),
                new Course(2, "Python", "Guido")
        );
    }

}
