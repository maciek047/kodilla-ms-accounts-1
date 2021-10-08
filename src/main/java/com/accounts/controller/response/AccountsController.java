package com.accounts.controller.response;

import com.accounts.dto.AccountDto;
import com.accounts.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class AccountsController {

    AccountsService accountsService;

    @GetMapping("/accounts")
    public AccountDto fetchAccounts (@RequestParam(name="customerId") Integer customerId){
        return accountsService.fetchAccountsByCustomerId(customerId);
    }
}
