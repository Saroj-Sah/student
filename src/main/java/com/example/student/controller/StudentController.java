package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entites.StudentEntity;
import com.example.student.serviceImpl.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/saveStudent")
	public StudentEntity saveStudent(@RequestBody StudentEntity student) {
		
		studentServiceImpl.saveStudent(student);
		return student;
		
	}
	
	@GetMapping(value="getAllStudent")
	public List<StudentEntity> findAllStudent(){
		return studentServiceImpl.findAllStudent();
		
	}
	
	@PutMapping("/updateStudent")
	public StudentEntity updateStudent(@RequestBody StudentEntity student) {
		return studentServiceImpl.updateStudent(student);
		
	}
	
	@DeleteMapping("delete")
	public String deleteStudent(@RequestParam long id) {
		studentServiceImpl.deleteStudent(id);
		return "Student Delete";
		
	}

}
