package br.com.devmendesc.santanderdevweek.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "accounts")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = true)
    private String number;
    @Column(nullable = false)
    private String agency;
    @Column(nullable = false, precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name = "additional_limit", nullable = false, precision = 2, scale = 13)
    private BigDecimal limit;

}