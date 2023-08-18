package org.pritam.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Model a = (Model) applicationContext.getBean("model");
        System.out.println("a = "+a.hashCode());
        System.out.println(a);
        applicationContext.close();
    }
}
