package org.pritam.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/pritam/springcore/config.xml");
        String string[] = applicationContext.getBeanNamesForType(Model.class);
        for(String name:string)
        	System.out.println(name);
        System.out.println(applicationContext.getBean(Model.class));
        applicationContext.close();
    }
}
