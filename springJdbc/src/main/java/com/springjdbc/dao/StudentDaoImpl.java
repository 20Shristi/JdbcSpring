package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
		String str= "insert into student(id,name,address) values(?,?,?)";
		int r= this.jdbcTemplate.update(str,student.getId(),student.getName(),student.getAddress());
		
		return r;
	}
	
    //update operation
	public int change(Student student) {
		String str="update student set name=?, address=? where id=?";
		int r= this.jdbcTemplate.update(str,student.getName(),student.getAddress(),student.getId());
		return r;
	}
  
	//delete operation
	public int delete(int id) {
		String str= "delete from student where id=?";
		int r= this.jdbcTemplate.update(str,id);
		return r;
	}
    // select operation
	public Student getStudent(int id) {
		// select single data
		String str=" select name from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student= this.jdbcTemplate.queryForObject(str, rowMapper,id);
		return student;
	}
	
	//selecting multiple studnet
	public List<Student> getAllStudent() {
		String str= "Select * from student";
		List<Student> students= this.jdbcTemplate.query(str, new RowMapperImpl());
		
		return students;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	

	

	

}
