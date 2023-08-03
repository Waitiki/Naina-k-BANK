package com.Nainak.nainakbankingapp.service;

import com.Nainak.nainakbankingapp.DTO.TransactionDto;
import com.Nainak.nainakbankingapp.entity.Transaction;
import com.Nainak.nainakbankingapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
    System.out.println("Transaction saved successfully");

    }
}
