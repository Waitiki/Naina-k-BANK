package com.Nainak.nainakbankingapp.service;

import com.Nainak.nainakbankingapp.DTO.AccountBalanceDto;
import com.Nainak.nainakbankingapp.entity.AccountBalance;
import com.Nainak.nainakbankingapp.repository.AccountBalanceRepository;
import com.Nainak.nainakbankingapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AccountBalanceServiceImpl implements AccountBalanceService {

    @Autowired
    AccountBalanceRepository accountBalanceRepository;
    @Override
    public void saveAmountToAccounts(AccountBalanceDto accountBalanceDto) {

        AccountBalance balance = AccountBalance.builder()
                .totalAccountBalance(accountBalanceDto.getTotalAccountBalance())
                .build();
        accountBalanceRepository.save(balance);
        System.out.println("Transaction saved to accounts!!");
    }
}
