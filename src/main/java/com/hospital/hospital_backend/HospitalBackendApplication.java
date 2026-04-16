package com.hospital.hospital_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hospital.hospital_backend")
public class HospitalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalBackendApplication.class, args);
	}
}