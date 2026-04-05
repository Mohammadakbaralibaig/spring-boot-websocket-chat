package com.example.websocketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WebsocketDemoApplication.class);
		java.util.Map<String, Object> defaults = new java.util.HashMap<>();
		defaults.put("server.port", "8081");
		app.setDefaultProperties(defaults);
		app.run(args);
	}
}
