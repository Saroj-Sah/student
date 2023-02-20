package com.example.student.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table", catalog="student_database")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int roll;
	private String name;
	private String address;
	public StudentEntity(long id, int roll, String name, String address) {
		super();
		this.id=id;
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public StudentEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
