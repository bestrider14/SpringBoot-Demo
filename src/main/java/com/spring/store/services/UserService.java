package com.spring.store.services;

import com.spring.store.domain.*;
import com.spring.store.domain.repositories.*;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final AddressRepository addressRepository;
    private final EntityManager em;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Transactional
    public void showEntityStates(){
        var user = User.builder()
            .name("John")
            .password("123")
            .email("john@gmail.com")
            .build();

        if(em.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");

        userRepository.save(user);

        if(em.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");
    }

    @Transactional
    public void showRelatedEntities(){
        var profile = profileRepository.findById(1L).orElseThrow();
        System.out.println(profile.getUser());
    }

    @Transactional
    public void getAddressById(long l) {
        var address = addressRepository.findById(l).orElseThrow();
        System.out.println(address);
    }

    public void persistReletad() {
        var user = User.builder()
            .name("John")
            .password("123")
            .email("john@gmail.com")
            .build();

        var address = Address.builder()
            .street("Main Street")
            .city("Main City")
            .zip("Main Zip")
            .build();

        user.addAddress(address);
        userRepository.save(user);
    }

    public void deleteRelated() {
        userRepository.deleteById(1L);
    }

    @Transactional
    public void manageProducts(){
        productRepository.deleteById(1L);
    }
}
