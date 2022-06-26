package com.greatlearning.collegefest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.collegefest.Entity.Student;
import com.greatlearning.collegefest.Service.StudentService;
import com.greatlearning.collegefest.Service.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	// add mapping for "/list"

	@RequestMapping("/list")
	public String listStudents(Model theModel) {
		System.out.println("request received...");
		List<Student> theStudents = studentService.findAll();

		theModel.addAttribute("Students", theStudents);

		return "list-Students";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// create model attribute to bind form data

		Student theStudent = new Student();
		theModel.addAttribute("Student", theStudent);

		return "Student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		// create model attribute to bind form data

		Student theStudent = studentService.findById(theId);
		theModel.addAttribute("Student", theStudent);

		return "Student-form";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestParam("studentId") int studentId, @RequestParam("studentName") String studentName,
			@RequestParam("department") String department, @RequestParam("country") String country) {

	if (!studentName.equals("") || !department.equals("") || !country.equals("")) {
		Student student = null;
		if (studentId != 0) {
			student = studentService.findById(studentId);
			student.setStudentName(studentName);
			student.setDepartment(department);
			student.setCountry(country);
		} else {
			student = new Student(studentName, department, country);
		}
		studentService.saveStudent(student);
		return "redirect:/list-Students";
	} else {
		return "redirect:/showFormForAdd";
	}
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int studentId) {
		studentService.deleteById(studentId);

		return "redirect:/student/list";
	}
}
