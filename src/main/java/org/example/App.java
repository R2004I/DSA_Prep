package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Car car1 = context.getBean(Car.class);
       Car car2 = context.getBean(Car.class);
        System.out.println(car1);
        System.out.println(car2);
    }
}
