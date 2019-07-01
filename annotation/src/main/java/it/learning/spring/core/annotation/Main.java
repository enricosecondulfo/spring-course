package it.learning.spring.core.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Envelope envelope = applicationContext.getBean(Envelope.class);
        Mailbox mailbox = applicationContext.getBean(Mailbox.class);

        User user = applicationContext.getBean(User.class);

        System.out.println(envelope);
        System.out.println(mailbox.getName());

        System.out.println(user);

        applicationContext.close();

    }
}
