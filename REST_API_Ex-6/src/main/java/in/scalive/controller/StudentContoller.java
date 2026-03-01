package in.scalive.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")

public class StudentContoller {
	
	@PostMapping("/welcome")
	public String welcome(@RequestBody String name) {
		return "Welcome "+name+" jee!";
	}
	
	
	
}
