package com.springBootAPP.springBootAPP.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootAPP.springBootAPP.dao.CourseDao;
import com.springBootAPP.springBootAPP.entities.Course;



@Service
public class CourseServiceImpl implements CourseService {
     
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceImpl() {
		/*
		 * list=new ArrayList<>(); list.add(new
		 * Course(145,"Java Course","this course contains baiscs of java"));
		 * list.add(new
		 * Course(146,"spring boot Course","this course contains baiscs of spring boot")
		 * );
		 */ 
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public List<Course> getCourses(long courseId) {
		/*
		 * Course c = null; for (Course course : list) { if(courseId==course.getId()) {
		 * c=course; break; } }
		 */
		System.out.println("finding course id by id:"+courseId);
		return courseDao.findByid(courseId);
	}
   
	
	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}
	
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}
	
}