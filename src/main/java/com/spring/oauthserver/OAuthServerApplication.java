package com.spring.oauthserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class OAuthServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
		.profiles("DEV")
		.sources(OAuthServerApplication.class)
		.run(args);
	}

}
