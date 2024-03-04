package com.needin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.needin.model.Address;



public interface AddressRepository extends JpaRepository<Address, Long> {

}
