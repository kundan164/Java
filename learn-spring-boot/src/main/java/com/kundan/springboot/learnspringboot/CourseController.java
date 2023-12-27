package com.kundan.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CourseController {
    // /course
    // Course: id, name, author

    @RequestMapping("/courses")
    public List<Course> retrievalAllCourse() {
        return Arrays.asList(
                new Course(1, "Lear AWS", "kundan"),
                new Course(2, "Learn DevOps", "kundan"),
                new Course(3, "Learn Azure", "kundan"),
                new Course(4, "Learn GCP", "kundan"));
    }
}
