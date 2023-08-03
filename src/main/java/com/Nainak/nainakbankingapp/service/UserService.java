package com.Nainak.nainakbankingapp.service;

import com.Nainak.nainakbankingapp.DTO.*;
import com.Nainak.nainakbankingapp.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
    Long userCount();
    List<User> getAllUsers();
    BankResponse deleteUser(Long userId);
    BigDecimal getTotalAmount();

}
