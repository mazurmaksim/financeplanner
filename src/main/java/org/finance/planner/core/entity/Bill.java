package org.finance.planner.core.entity;

import jakarta.persistence.*;

import java.util.UUID;

//@Entity
//@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "type")
    private String type;

    @Column(name = "balance")
    private Double balance;

    @OneToOne(mappedBy = "bill")
    private FinanceUser financeUser;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public FinanceUser getFinanceUser() {
        return financeUser;
    }

    public void setFinanceUser(FinanceUser financeUser) {
        this.financeUser = financeUser;
    }
}
