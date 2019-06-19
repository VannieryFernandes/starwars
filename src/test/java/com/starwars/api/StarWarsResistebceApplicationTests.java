package com.starwars.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class StarWarsResistebceApplicationTests {
	
	final String BASE_PATH = "http://localhost:8888/api/";
	
	@Test
	public void contextLoads() {
	}

}
