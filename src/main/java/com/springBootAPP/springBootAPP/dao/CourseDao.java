package com.springBootAPP.springBootAPP.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootAPP.springBootAPP.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	List<Course> findByid(long id);
	
}
