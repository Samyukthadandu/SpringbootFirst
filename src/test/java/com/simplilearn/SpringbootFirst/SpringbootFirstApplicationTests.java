package com.simplilearn.SpringbootFirst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootFirstApplicationTests {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringbootFirstApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		logger.info("2 Test case executing...");
		assertEquals(true,true);
	}

}
