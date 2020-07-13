package org.steinko.todo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class TestConfig {
	
	@Bean
	StepSharing stepSharing()  {
		return new StepSharing();
	}

}
