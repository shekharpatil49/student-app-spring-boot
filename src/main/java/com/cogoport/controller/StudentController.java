package com.cogoport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogoport.entity.Student;
import com.cogoport.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student/{rollno}")
	public List<Student> getStudent(@PathVariable int rollno){
		return studentService.getStudent(rollno);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/student")
	public Student addNewStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/student/{rollno}")
	public String deleteStudent(@PathVariable int rollno) {
		return studentService.deleteStudent(rollno);
	}

}
