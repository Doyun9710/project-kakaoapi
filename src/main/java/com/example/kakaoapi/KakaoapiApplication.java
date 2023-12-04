package com.example.kakaoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
//@ComponentScan( basePackages = { "com.example.kakaoapi.direction" } )
public class KakaoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakaoapiApplication.class, args);
	}

}
