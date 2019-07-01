package it.learning.spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean(initMethod = "init")
    public Mailbox buildMessage(){
        Mailbox mailbox = new Mailbox();
        mailbox.setName("test mailbox");

        return mailbox;
    }

    @Bean
    public UserProfile userProfile() {
        UserProfile userProfile = new UserProfile();
        userProfile.setName("user");

        return userProfile;
    }

    @Bean
    public User user(UserProfile userProfile) {
        User user = new User();
        user.setUserProfile(userProfile);

        return user;

    }
}


