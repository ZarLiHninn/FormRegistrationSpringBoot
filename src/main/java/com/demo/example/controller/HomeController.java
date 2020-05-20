package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.example.model.Grade;
import com.demo.example.model.Student;

@Controller
@RequestMapping("/form")
public class HomeController {
	@Autowired
	@Qualifier("subjects")
	private List < String > subjects;

	@Autowired
	@Qualifier("days")
	private List < String > days;

	@Autowired
	@Qualifier("months")
	private List < String > months;

	@Autowired
	@Qualifier("years")
	private List < String > years;

	@GetMapping
	public String get(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "form";
    }

	@PostMapping
	public String post(Student dto, ModelMap map) {
		map.put("result", dto);
		return "form";
	}

	@ModelAttribute("subjects")
	public List < String > subjects() {
		return subjects;
	}

	@ModelAttribute("days")
	public List < String > days() {
		return days;
	}

	@ModelAttribute("months")
	public List < String > months() {
		return months;
	}

	@ModelAttribute("years")
	public List < String > years() {
		return years;
	}

	@ModelAttribute("grades")
	public Grade[] grades() {
		return Grade.values();
	}
}