package it.learning.spring.core.beanlife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Message message = (Message) context.getBean("message");
        System.out.println(message);
        context.registerShutdownHook();
    }
}
