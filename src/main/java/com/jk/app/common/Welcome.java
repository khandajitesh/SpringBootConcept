package com.jk.app.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	@RequestMapping(value = "/")
	public String welcome() {
	return "index";
	}

}
