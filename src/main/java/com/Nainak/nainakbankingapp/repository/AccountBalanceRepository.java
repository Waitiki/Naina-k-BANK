package com.Nainak.nainakbankingapp.repository;

import com.Nainak.nainakbankingapp.entity.AccountBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountBalanceRepository extends JpaRepository<AccountBalance, Long> {
}
