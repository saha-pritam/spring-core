package org.pritam.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"org/pritam/springcore/config.xml");
		System.out.println("modelA1 = " + applicationContext.getBean("modelA1"));
		System.out.println("modelA2 = " + applicationContext.getBean("modelA2"));
		System.out.println("modelA3 = " + applicationContext.getBean("modelA3"));
		System.out.println(applicationContext.getBean(ModelB.class));
		applicationContext.close();
	}
}
