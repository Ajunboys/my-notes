package com.codedot.lombok.test;

import java.util.Date;

import com.codedot.lombok.model.User;

public class LombokDemoTest {
	
	public static void main(String[] args) {
		User user = new User();
		user.setId(9982313891523L);
		user.setEmail("jason@gmail.com");
		user.setUsername("jason");
		user.setBirthday(new Date(2018, 11, 25));
		
		System.out.println(user);
		
	}

}
