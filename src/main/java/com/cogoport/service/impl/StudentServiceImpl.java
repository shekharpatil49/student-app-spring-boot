package com.cogoport.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogoport.dao.StudentDao;
import com.cogoport.entity.Student;
import com.cogoport.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {	
		return studentDao.save(student);
	}
	@Override
	public List<Student> getStudent(int rollNo) {
	
		return studentDao.findByRollNo(rollNo);
	}
	@Override
	public List<Student> getAllStudents() {
		
		return studentDao.findAll();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentDao.save(student);
	}
	@Override
	public void deleteStudent(int rollno) {
		List<Student> student = studentDao.findByRollNo(rollno);
		studentDao.delete(student.get(0));
	}

}
