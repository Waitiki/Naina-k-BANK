package com.Nainak.nainakbankingapp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Account_Balance")
public class AccountBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String start;
    private BigDecimal totalAccountBalance;
    @CreationTimestamp
    private LocalDateTime balanceAsPer;

}
