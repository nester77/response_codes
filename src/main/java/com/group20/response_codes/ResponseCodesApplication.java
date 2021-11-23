package com.group20.response_codes;

import com.group20.response_codes.service.ResponseCodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResponseCodesApplication  implements CommandLineRunner {

	@Autowired
	private ResponseCodesService responseCodesService;

	public static void main(String[] args) {
		SpringApplication.run(ResponseCodesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
	}
