package org.leon.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.leon.dao.StudentRepository;
import org.leon.entity.Student;
import org.leon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl
		implements
			StudentService {
	@Autowired
	private StudentRepository sRepository;

	@Override
	public Student save(String name, String no) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName(name);
		s.setNo(no);
		Student stu=sRepository.save(s);
		return stu;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		sRepository.deleteById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> list=sRepository.findAll();
		return list;
	}
	

}
