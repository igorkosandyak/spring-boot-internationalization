package com.demo.controllers;

import com.demo.util.Translator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class MainController {

	@GetMapping()
	public String getMessage(@RequestParam("msg") String message) {
		return Translator.toLocale(message);
	}
}
