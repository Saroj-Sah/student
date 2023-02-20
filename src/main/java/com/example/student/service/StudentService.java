package com.example.student.service;

import java.util.List;

import com.example.student.entites.StudentEntity;

public interface StudentService {
	//To save new student
	public StudentEntity saveStudent(StudentEntity student);
	
	//To update Student
	public StudentEntity updateStudent(StudentEntity student);
	
	//To fetch all student from database
	
	public List<StudentEntity> findAllStudent();
	
	//To delete student
	public void deleteStudent(long id);

}
