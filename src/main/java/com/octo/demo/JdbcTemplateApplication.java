package com.octo.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.octo.repository.LanguageRepository;

@SpringBootApplication
public class JdbcTemplateApplication {
	
	@Autowired
	static LanguageRepository languageRepository;

	public static void main(String[] args) {
		SpringApplication.run(JdbcTemplateApplication.class, args);
		
	}

}
