package com.accounts.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="customers")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="customer-id")
    private Integer customerId;

    @OneToMany(
            targetEntity = Account.class,
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Account> accounts;
}
