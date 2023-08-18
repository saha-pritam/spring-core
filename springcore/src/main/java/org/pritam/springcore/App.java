package org.pritam.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/pritam/springcore/config.xml");
        System.out.println("Bean modelB1 "+applicationContext.getBean("modelB1"));
        System.out.println("Bean modelB2 "+applicationContext.getBean("modelB2"));
        System.out.println(applicationContext.getBean(ModelA.class));
        applicationContext.close();
    }
}
