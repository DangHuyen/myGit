package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.springboothibernate.service.StudentService;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class,scanBasePackages= {"com.springboothibernate","com.example.demo"})
public class StudentCourseResfulControllerApplication implements CommandLineRunner{

	@Autowired
	private StudentService studentServiceImpl;
	
	public static void main(String[] args){
		SpringApplication.run(StudentCourseResfulControllerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("======fsa fas fsa ====");
		System.out.println(studentServiceImpl.findAll()); 
		
	}
}


