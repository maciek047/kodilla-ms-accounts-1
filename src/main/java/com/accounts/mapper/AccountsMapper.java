package com.accounts.mapper;

import com.accounts.domain.Account;
import com.accounts.dto.AccountDto;
import org.springframework.stereotype.Component;

@Component
public class AccountsMapper {
    public AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getNrb(),
                account.getCurrency(),
                account.getAvailableFunds());
    }
}
