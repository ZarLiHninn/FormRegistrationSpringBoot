package com.demo.example.controller;

import com.demo.example.service.StudentFormInitOutput;
import com.demo.example.service.StudentFormInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.example.model.Student;

@Controller
public class HomeController {

	@Autowired
	StudentFormInitService service;

	@ModelAttribute
	public StudentFormInitOutput setUp() {
		return new StudentFormInitOutput();
	}

	@GetMapping(value = {"/", "/home"})
	public String initHome() {
		return "home";
	}

	@GetMapping(value = "/form")
	public String initStudentForm(ModelMap model) {
		initForm(model);
		return "form";
    }

	@PostMapping(value = "/form")
	public String submitForm(Student student, ModelMap model) {
		initForm(model);
		model.put("result", student);
		return "form";
	}

	private void initForm(ModelMap model) {

		StudentFormInitOutput output = service.init();

		model.put("birthDays",   output.getBirthDays());
		model.put("birthMonths", output.getBirthMonths());
		model.put("birthYears",  output.getBirthYears());
		model.put("subjects",    output.getSubjects());
		model.put("grades",      output.getGrades());

	}

}