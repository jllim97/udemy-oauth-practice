package com.way2learnonline;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${server.ssl.key-store-password}")
	private String keystorePassword;
	
	@GetMapping("/hello")
	public String sayHello(String name) {
		System.out.println("keystore password: " + keystorePassword);
		return "Hello "+name + keystorePassword;
	}
	
	
	@GetMapping("/admin/hello")
	public String sayAdminHello(String name) {
		return "Hello Admin "+name;
	}


}
