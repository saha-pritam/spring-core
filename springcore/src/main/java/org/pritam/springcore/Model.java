package org.pritam.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Model implements InitializingBean, DisposableBean {
	public Model() {
		System.out.println("This is constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy method");	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is start method");	
	}
}
