package com.aashish.repository;

import org.springframework.data.repository.CrudRepository;

import com.aashish.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
