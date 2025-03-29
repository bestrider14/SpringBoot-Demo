package com.spring.store;

import com.spring.store.domain.Address;
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

        var address = Address.builder()
            .street("street")
            .city("city")
            .zip("zip")
            .build();

        user.addAddress(address);
        System.out.println(user);
    }
}
