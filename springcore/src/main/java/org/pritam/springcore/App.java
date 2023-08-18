package org.pritam.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/pritam/springcore/config.xml");
        Model a = applicationContext.getBean(Model.class);
        Model b = applicationContext.getBean(Model.class);
        Model c = applicationContext.getBean(Model.class);
        System.out.println("a = "+a.hashCode());
        System.out.println("b = "+b.hashCode());
        System.out.println("c = "+c.hashCode());
        applicationContext.close();
    }
}
