package com.emsi.digital_bancking_backend.entities;

import com.emsi.digital_bancking_backend.enums.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private double amount;
    @ManyToOne
    private BankAccount bankAccount;
    private String description;
}
