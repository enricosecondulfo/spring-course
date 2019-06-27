package it.learning.spring.core.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Message message1 = (Message) context.getBean("message1");
        message1.setMessage("Altered message 1");
        Message message1a = (Message) context.getBean("message1");
        System.out.println(message1);
        System.out.println(message1a);

        Message message2 = (Message) context.getBean("message2");
        message2.setMessage("Altered message 2");
        Message message2a = (Message) context.getBean("message2");
        System.out.println(message2);
        System.out.println(message2a);
    }
}
