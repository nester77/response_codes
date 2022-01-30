package com.group20.response_codes;

import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.service.ResponseCodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ResponseCodesApplication  implements CommandLineRunner {

	@Autowired
	private ResponseCodesService responseCodesService;

	public static void main(String[] args) {


		List<ResponseCodes> mainResponseCodes;
		ResponseCodes mainTrueCode;

		SpringApplication.run(ResponseCodesApplication.class, args);


	}



	@Override
	public void run(String... args) throws Exception {



	}
	}
