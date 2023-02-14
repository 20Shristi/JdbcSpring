package com.springjdbc.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con= new ClassPathXmlApplicationContext("com/springjdbc/springJdbc/config.xml");
//        JdbcTemplate temp=con.getBean("jdbcTemplate", JdbcTemplate.class);
//        
//       //insert query
//        String str= "insert into student(id,name,address) values(?,?,?)";
//        //execute query
//        int result= temp.update(str, 102,"abc","bsr");
//        System.out.println("NUmber of records added : "+result);
        
        
          StudentDao studentdao= con.getBean("studentdao", StudentDao.class);
//        
//        Student s= new Student();
//        s.setId(103);
//        s.setName("Shristi");
//        s.setAddress("Delhi");
//        int result =studentdao.insert(s);
//        
//        System.out.println("Number of records added : "+result);
        
          //upadte
//        Student s= new Student();
//        s.setId(103);
//        s.setName("Ram");
//        s.setAddress("Uk");
//        int result =studentdao.insert(s);
//        
//        System.out.println("Number of updated records: "+result);
        
          //delete
//          int result= studentdao.delete(102);
//          System.out.println("Deleted rows: "+result);
  
        //select
        
//        Student student=studentdao.getStudent(101);
//        System.out.println(student);
          
          //multiple select
          List<Student> students= studentdao.getAllStudent();
          for(Student s: students) {
        	  System.out.println(s);
          }
        
    }
}
