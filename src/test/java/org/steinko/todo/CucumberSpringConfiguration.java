package org.steinko.todo;


import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.spring.CucumberContextConfiguration;


@CucumberContextConfiguration
@SpringBootTest(classes = TestConfig.class)

public class CucumberSpringConfiguration {
	
	
}
