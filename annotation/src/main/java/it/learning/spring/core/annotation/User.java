package it.learning.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

    private UserProfile userProfile;

    public UserProfile getUserProfile() {
        return userProfile;
    }

    @Autowired
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
