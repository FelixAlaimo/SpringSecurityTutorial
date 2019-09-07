package io.javabrains.springsecurity.courseapisecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "<h1>Welcome to the home page!</h1>";
	}

}
