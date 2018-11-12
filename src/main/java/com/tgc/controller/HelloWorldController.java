
package com.tgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "hello world~";
		//http://localhost:8080/helloworld
	}
	
}
