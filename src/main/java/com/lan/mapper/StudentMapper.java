package com.lan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lan.entity.Student;

public interface StudentMapper {
	@Insert("insert into student (id,name,username,passwrod,age,sex,birthday,createtime) values (#{nmae},#{username},#{password},#{age},#{sex},#{birthday},now())")
	public void add(Student student);
	@Delete("delete form student where id=#{id}")
	public void deleteById(int id);
	@Update("update student set(name=#{name},username=#{username},password=#{password},age=#{age},sex=#{sex},birthday=#{birthday}")
	public void update(Student student);
	@Select("select*from student where id=#{id}")
	public Student queryById(int id);
	@Select("select*from student")
	public List<Student> qeryByAll();
	
	public List<Student> qeryByPage(int curr ,int page);
}
