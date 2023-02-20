package com.example.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentRepository;
import com.example.student.entites.StudentEntity;
import com.example.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository StudentRepo;
	
	@Override
	public StudentEntity saveStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		return StudentRepo.save(student);
	}

	@Override
	public StudentEntity updateStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		return StudentRepo.save(student);
	}

	@Override
	public List<StudentEntity> findAllStudent() {
		// TODO Auto-generated method stub
		return (List<StudentEntity>) StudentRepo.findAll();
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		StudentRepo.deleteById(id);
		
	}

}
