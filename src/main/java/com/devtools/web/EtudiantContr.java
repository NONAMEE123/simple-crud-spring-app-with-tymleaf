package com.devtools.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantContr {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
