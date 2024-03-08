package org.finance.planner.core.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "user_name")
    private String name;
    @Column(name = "last_name")
    private String lasName;

//    @OneToOne(mappedBy = "user")
//    private FinanceUser financeUser;

    @Column(name= "token")
    private String token;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

//    public FinanceUser getFinanceUser() {
//        return financeUser;
//    }
//
//    public void setFinanceUser(FinanceUser financeUser) {
//        this.financeUser = financeUser;
//    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
