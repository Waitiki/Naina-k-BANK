package com.Nainak.nainakbankingapp.controller;

import com.Nainak.nainakbankingapp.DTO.AccountBalanceDto;
import com.Nainak.nainakbankingapp.service.AccountBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class BalanceController {

    @Autowired
    AccountBalanceService accountBalanceService;

    @PostMapping("/accounts")
    public void balance(@RequestBody AccountBalanceDto balanceDto){
        accountBalanceService.saveAmountToAccounts(balanceDto);
    }
}
