package com.accounts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="nrb")
    private String nrb;

    @Column(name="currrency")
    private String currency;

    @Column(name="available-funds")
    private BigDecimal availableFunds;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customers_id")
    private Customer customer;
}
