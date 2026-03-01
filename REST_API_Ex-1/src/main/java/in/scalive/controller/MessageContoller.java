package in.scalive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageContoller {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to my first REST API";
	}

}
