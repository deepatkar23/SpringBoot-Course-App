package com.springBootAPP.springBootAPP.services;

import java.util.List;
import com.springBootAPP.springBootAPP.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public List<Course> getCourses(long courseId);
	
	public Course addCourse(Course course);
}
