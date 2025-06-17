package com.ahk.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com/ahk/boot/controller")
public class BootPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPrepApplication.class, args);
		String x= "New Test";
		
	}

}
