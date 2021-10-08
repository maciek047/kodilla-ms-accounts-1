package com.accounts.repository;

import com.accounts.domain.Account;
import com.accounts.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Account, Integer> {
    Account findAccountByCustomer(Customer customer);

}
