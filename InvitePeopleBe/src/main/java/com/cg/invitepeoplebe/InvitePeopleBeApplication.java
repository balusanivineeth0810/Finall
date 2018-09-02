package com.cg.invitepeoplebe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.invitepeoplebe")
public class InvitePeopleBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvitePeopleBeApplication.class, args);
	}
}
