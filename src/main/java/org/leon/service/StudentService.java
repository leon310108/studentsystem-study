package org.leon.service;

import java.util.List;

import org.leon.entity.Student;

public interface StudentService {
	public Student save(String name,String no);
	public List<Student> findAll();
	public void delete(Long id);
}
