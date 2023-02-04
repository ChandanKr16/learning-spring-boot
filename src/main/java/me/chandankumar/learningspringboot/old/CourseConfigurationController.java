package me.chandankumar.learningspringboot.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseConfigurationController {

    @Autowired
    private CourseServiceConfiguration courseServiceConfiguration;

    @GetMapping("/config")
    public CourseServiceConfiguration getCourseServiceConfiguration(){
        return courseServiceConfiguration;
    }

}
