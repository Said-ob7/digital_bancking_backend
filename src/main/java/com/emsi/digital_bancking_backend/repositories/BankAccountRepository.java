package com.emsi.digital_bancking_backend.repositories;

import com.emsi.digital_bancking_backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
