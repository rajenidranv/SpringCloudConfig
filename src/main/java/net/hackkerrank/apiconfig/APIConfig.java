package net.hackkerrank.apiconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class APIConfig {

	public static void main(String[] args) {
		SpringApplication.run(APIConfig.class, args);
	}

}