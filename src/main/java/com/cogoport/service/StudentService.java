package com.cogoport.service;

import java.util.List;

import com.cogoport.entity.Student;

public interface StudentService {

	public Student addStudent(Student student);
	public List<Student> getStudent(int rollNo);
	public List<Student> getAllStudents();
	public Student updateStudent(Student student);
	public String deleteStudent(int rollNo);
	
}
