package com.emsi.digital_bancking_backend.entities;

import com.emsi.digital_bancking_backend.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", length = 4, discriminatorType = DiscriminatorType.STRING)

@Data @NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "bankAccount")
    private List<AccountOperation> accountOperations;
}
