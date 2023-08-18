package org.pritam.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	@Bean("model")
	@Scope("prototype")
	public Model getModel() {
		return new Model();
	}
}
