package com.example.basicproject.service;

import java.util.List;

import com.example.basicproject.model.Student;

public interface StudentService {

	
	public Student saveStudent(Student student);
	public  List<Student> getAllStudents();
	}
