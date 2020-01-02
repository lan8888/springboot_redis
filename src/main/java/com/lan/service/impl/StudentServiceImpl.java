package com.lan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lan.entity.Student;
import com.lan.mapper.StudentMapper;
import com.lan.service.StudentService;

@Service
@CacheConfig(cacheNames="student")
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public void add(Student student) {
		studentMapper.add(student);
		
	}

	@Override
	public void deleteById(int id) {
		studentMapper.deleteById(id);
		
	}

	@Override
	public void update(Student student) {
		studentMapper.update(student);
		
	}
	
	@Override
	@Cacheable(key="'student_'+#id")//@Cacheable student_id  
	public Student queryById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.queryById(id);
	}

	@Override
	public List<Student> qeryByAll() {
		// TODO Auto-generated method stub
		return studentMapper.qeryByAll();
	}

	@Override
	public List<Student> qeryByPage(int curr, int page) {
		// TODO Auto-generated method stub
		return studentMapper.qeryByPage(curr, page);
	}

	@Override
	public void aoo() {
		// TODO Auto-generated method stub
		
	}

}
