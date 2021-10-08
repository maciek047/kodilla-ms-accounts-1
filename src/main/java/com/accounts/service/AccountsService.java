package com.accounts.service;

import com.accounts.domain.Customer;
import com.accounts.dto.AccountDto;
import com.accounts.mapper.AccountsMapper;
import com.accounts.repository.AccountsRepository;
import com.accounts.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Autowired
    private CustomersRepository customersRepository;

    private AccountsMapper accountsMapper;

    public AccountDto fetchAccountsByCustomerId(Integer customerId){
        Customer theCustomer = customersRepository.findCustomerByCustomerId(customerId);
        return accountsMapper.mapToAccountDto(
                accountsRepository.findAccountByCustomer(theCustomer));
    }

}
