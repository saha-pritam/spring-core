package org.pritam.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Model getModel() {
		return new Model();
	}
}
