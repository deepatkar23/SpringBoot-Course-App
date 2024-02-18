package com.springBootAPP.springBootAPP.controller;

import java.util.List;
import com.springBootAPP.springBootAPP.services.CourseService;
import com.springBootAPP.springBootAPP.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//get the courses
	@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.GET)
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.courseService.getCourses();
		
	}
	
	//get the courses by id
		@GetMapping("/courses/{courseId}")
		public List<Course> getCourse(@PathVariable String courseId){
			return this.courseService.getCourses(Long.parseLong(courseId));
			
		}
		
	//course add
		@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.POST)
		@PostMapping("/courses")
		public Course addCourse(@RequestBody Course course) {
			return this.courseService.addCourse(course);
		}
		
}
