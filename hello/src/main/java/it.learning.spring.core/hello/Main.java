package it.learning.spring.core.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Message message = (Message) context.getBean("helloWorld");
        System.out.println(message);
    }
}
