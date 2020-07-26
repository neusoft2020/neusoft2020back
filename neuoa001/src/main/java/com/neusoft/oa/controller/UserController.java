package com.neusoft.oa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/ok")
	public String ok() {
		return "okAndOkAAAAAAA";
	}

}
