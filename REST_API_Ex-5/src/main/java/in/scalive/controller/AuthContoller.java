package in.scalive.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthContoller {
	
	@PostMapping("/login")
	public String login() {
		return "Login successful";
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "Logout successful";
	}
}
