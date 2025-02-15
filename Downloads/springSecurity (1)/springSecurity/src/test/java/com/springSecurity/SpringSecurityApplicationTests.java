package com.springSecurity;

import com.springSecurity.entities.User;
import com.springSecurity.service.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityApplicationTests {
@Autowired
private JwtService jwtService;

	@Test
	void contextLoads() {
		User user = new User(4L,"anshu@gmail.com","123");
		String token = jwtService.generateToken(user);
		System.out.println(token);
		Long id = jwtService.getUserIdFromToken(token);
		System.out.println(id);

	}

}
