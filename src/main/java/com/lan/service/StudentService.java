package com.lan.service;

import java.util.List;

import com.lan.entity.Student;

public interface StudentService {
	public void add(Student student);
	public void deleteById(int id);
	public void update(Student student);
	public Student queryById(int id);
	public List<Student> qeryByAll();
	
	public List<Student> qeryByPage(int curr ,int page);
}
