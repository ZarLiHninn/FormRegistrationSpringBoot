package com.demo.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.demo.example.constant.Grade;
import com.demo.example.constant.Subject;
import com.demo.example.model.Student;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("grade", Grade.values());
		model.addAttribute("subject", Subject.values());
		return "form";
	}

	@PostMapping("/result")
	public String submitForm(Student student, Model model) {
		model.addAttribute("result", student);
		return "result";
	}

	@GetMapping("/back")
	public String backHome() {
		return "redirect:/";
	}

}