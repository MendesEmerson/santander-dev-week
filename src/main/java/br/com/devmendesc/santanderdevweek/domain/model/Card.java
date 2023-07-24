package br.com.devmendesc.santanderdevweek.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private  String number;
    @Column(name = "available_limit", nullable = false, scale = 2, precision = 13)
    private BigDecimal limit;
}
