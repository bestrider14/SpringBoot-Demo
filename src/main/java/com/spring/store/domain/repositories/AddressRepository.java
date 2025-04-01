package com.spring.store.domain.repositories;

import com.spring.store.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}