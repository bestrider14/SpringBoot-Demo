package com.spring.store;

import com.spring.store.domain.Address;
import com.spring.store.domain.Profile;
import com.spring.store.domain.Tag;
import com.spring.store.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
            .name("John")
            .password("password")
            .email("john@codewithmosh.com")
            .build();

        var profile = Profile.builder()
            .bio("bio")
            .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}
