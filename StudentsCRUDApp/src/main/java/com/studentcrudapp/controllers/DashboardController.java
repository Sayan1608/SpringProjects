package com.studentcrudapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentcrudapp.entity.Student;
import com.studentcrudapp.service.StudentService;

@Controller
public class DashboardController {
	
//	@Autowired
////	@Qualifier("studentSercviceImpl")
//	private StudentService studentService;
	
	@RequestMapping("/dashboard")
	public String loadDashboard() {
		
//		System.out.println(studentService.listStudents());
		
		return "view/dashboard.jsp";
	}
	
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String liststudents(Model model) {
//        model.addAttribute("students", new Student());
//        model.addAttribute("studentList", studentService.listStudents());
//        return "view/students.jsp";
//    }
}
