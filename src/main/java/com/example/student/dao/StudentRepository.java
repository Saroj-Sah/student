package com.example.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.student.entites.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Long>{

}
