package org.leon;


import org.junit.jupiter.api.Test;
import org.leon.entity.Student;

import org.leon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
@SpringBootTest
@Slf4j
public class StudentSaveAndDeleteTest {
	@Autowired
	private StudentService service;

	@Test
	public void testSave() {
		Student s=service.save("zhaoliu", "20200001201");
		log.info(s.toString());;
	}
}
