package com.manoj.boot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HttpSample {

	@GetMapping(path = "/hello")
	public ResponseEntity<String> printHello() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

	@GetMapping(path = "/notprotected")
	public ResponseEntity<String> notprotected() {
		return new ResponseEntity<String>("Hello not protected", HttpStatus.OK);
	}

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("/login");
	}

}
