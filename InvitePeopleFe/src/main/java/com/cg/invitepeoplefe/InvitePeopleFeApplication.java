package com.cg.invitepeoplefe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.invitepeoplefe")
public class InvitePeopleFeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvitePeopleFeApplication.class, args);
	}
}
