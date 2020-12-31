package org.leon.control;

import java.util.List;

import org.leon.dao.StudentRepository;
import org.leon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebControl {
	@Autowired
	StudentRepository sRepository;
	@RequestMapping("/findall")
	public String find(Model m) {
		List<Student> list=sRepository.findAll();
		m.addAttribute("List", list);
		return "findall";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		return "login";
	}
}
