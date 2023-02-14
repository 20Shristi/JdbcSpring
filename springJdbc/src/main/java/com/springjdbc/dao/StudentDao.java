package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
    public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
}
 