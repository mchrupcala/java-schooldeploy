package com.lambdaschool.schooldeploy.services;

import com.lambdaschool.schooldeploy.models.Course;
import com.lambdaschool.schooldeploy.view.CountStudentsInCourses;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface CourseService
{
    ArrayList<Course> findAll();

    ArrayList<Course> findAllPageable(Pageable pageable);

    Course  save(Course course);

    Course findCourseById(long id);

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);
}
