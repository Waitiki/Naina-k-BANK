package com.Nainak.nainakbankingapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountBalanceDto {

    private String start;
    private BigDecimal totalAccountBalance;
}
