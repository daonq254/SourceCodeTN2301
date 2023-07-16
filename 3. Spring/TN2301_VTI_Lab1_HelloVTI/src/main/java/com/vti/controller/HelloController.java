package com.vti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@CrossOrigin("*")
public class HelloController {

	@GetMapping
	public String getHello() {

		return "Hello VTI Academy";

	}

	@PostMapping
	public String createHello() {

		return "Create Hello";

	}

	@DeleteMapping
	public String deleteHello() {

		return "delelete Hello";

	}
}
