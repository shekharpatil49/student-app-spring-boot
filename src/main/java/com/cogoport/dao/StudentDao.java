package com.cogoport.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogoport.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

	List<Student> findByRollNo(int rollno);

}
