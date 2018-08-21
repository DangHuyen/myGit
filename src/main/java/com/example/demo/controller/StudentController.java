package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboothibernate.entities.Student;
import com.springboothibernate.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;


	@RequestMapping(value = "/students", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE/*, MediaType.APPLICATION_XML_VALUE*/ })
    @ResponseBody
    public List<Student> getEmployees() {
        List<Student> list = studentService.findAll();
        return list;
    }
	
	@RequestMapping(value = "/student", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE/*, MediaType.APPLICATION_XML_VALUE*/ })
    @ResponseBody
    public Student getStudent() {
        Student list = studentService.findById(2);
        return list;
    }
	/*@RequestMapping	(value = "/student", method = RequestMethod.POST,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Student addStudent() {
		Student student= new Student("DOG", "doggy@gmail.com", "2C14", "Ha Noi");
		studentService.save(student);
		return student;
	}*/
	
	@RequestMapping	(value = "/student", method = RequestMethod.POST,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public void addStudent() {
		Student student= new Student("Dobby", "dobby@gmail.com", "2C14", "Ha Noi");
		studentService.save(student);
		
	}

	
}




