package com.Nainak.nainakbankingapp.repository;

import com.Nainak.nainakbankingapp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
