package org.finance.planner.core.entity;

import jakarta.persistence.*;

import java.util.UUID;

//@Entity
//@Table(name = "finance_user")
public class FinanceUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name="user_bill", nullable = false, referencedColumnName = "id")
    private Bill bill;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
