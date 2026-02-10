package com.bridge.accounts.service.impl;

import com.bridge.accounts.dto.CustomerDto;
import com.bridge.accounts.repository.AccountsRepository;
import com.bridge.accounts.repository.CustomerRepository;
import com.bridge.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
