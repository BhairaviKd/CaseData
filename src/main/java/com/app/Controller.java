package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@GetMapping("/getCaseData/")
	public String getCaseData() {
		return "You are in CaseData";
	}
	
}
