package com.one.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

	@Autowired
	Hello he;

	@Test
	public void contextLoads() {
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");
		System.out.println(he.getValue()+"----------------------");




	}

}
