package com.accounts.repository;

import com.accounts.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<Customer, Integer> {

     Customer findCustomerByCustomerId(Integer customerId);

    }

