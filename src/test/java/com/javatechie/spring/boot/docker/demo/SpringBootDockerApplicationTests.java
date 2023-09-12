package com.javatechie.spring.boot.docker.demo;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDockerApplicationTests {

	@Test
	public void contextLoads() {
		String actual= "blabla";
		String expected= "BlabLA";

		assertTrue("blabla".equalsIgnoreCase("BlabLA"));
		assertThat(actual, is(equalToIgnoringCase(expected)));
		assertThat(actual, equalToIgnoringCase(expected));
		assertThat(actual, IsEqualIgnoringCase.equalToIgnoringCase(expected));
	}




}

