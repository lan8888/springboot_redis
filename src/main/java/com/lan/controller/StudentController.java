package com.lan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lan.entity.Student;
import com.lan.service.StudentService;

@RestController
@RequestMapping("/nb")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/query")
	public Student queryById(int id) {
		return studentService.queryById(id);
	}
}
