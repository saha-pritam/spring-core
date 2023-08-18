package org.pritam.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Model{
	public Model() {
		System.out.println("This is constructor");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("This is destroy method");	
	}

	@PostConstruct
	public void start() throws Exception {
		System.out.println("This is start method");	
	}
}
