package org.pritam.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/pritam/springcore/config.xml");
        System.out.println(applicationContext.getBean(ModelA.class));
        System.out.println(applicationContext.getBean(ModelB.class));
        applicationContext.close();
    }
}
