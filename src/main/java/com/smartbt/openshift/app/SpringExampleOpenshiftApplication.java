package com.smartbt.openshift.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleOpenshiftApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to java";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "welcome ".concat(input);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleOpenshiftApplication.class, args);
	}

}
